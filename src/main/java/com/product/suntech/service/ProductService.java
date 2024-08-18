package com.product.suntech.service;

import com.product.suntech.ProductNotFoundException;
import com.product.suntech.model.Product;
import com.product.suntech.model.RecommendationResponse;
import com.product.suntech.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getProduct(Integer prodId, String prodName, String prodtype) {
        List<Product> products = new ArrayList<>();

        if (prodId != null) {
            // Search by ID
            products.add(getProductById(prodId));
        } else if (prodName != null && !prodName.isEmpty()) {
            // Search by Name
            products.add(getProductByName(prodName));
        } else if (prodtype != null && !prodtype.isEmpty()) {
            // Search by Type
            products.addAll(getProductsByType(prodtype));
        } else {
            // If no criteria provided, return all products
            products = repo.findAll();
        }

        return products;
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId)
                .orElseThrow(() -> new ProductNotFoundException("Product not found at ID " + prodId));
    }

    public Product getProductByName(String prodName) {
        List<Product> products = repo.findByProdName(prodName);

        if (products.isEmpty()) {
            throw new ProductNotFoundException("No products found with name: " + prodName);
        }

        return products.get(0);
    }
    public List<Product> getProductsByType(String prodtype) {
        return repo.findByProdtype(prodtype);
    }


    public void addProduct(Product prod) {
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(int prodId, Product prod) {
        Product existingProduct = repo.findById(prodId)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID " + prodId));

        existingProduct.setProdName(prod.getProdName());
        existingProduct.setPrice(prod.getPrice());
        existingProduct.setProdtype(prod.getProdtype());
        existingProduct.setImageFileName(prod.getImageFileName());
        existingProduct.setBrand(prod.getBrand());

        repo.save(existingProduct);
    }

    public void deleteProduct(int prodId) {
        if (!repo.existsById(prodId)) {
            throw new ProductNotFoundException("Product not found with ID " + prodId);
        }
        repo.deleteById(prodId);
    }

    public RecommendationResponse getRecommendations(String prodName, String brand) {
        List<Product> recommendations = new ArrayList<>();
        String errorMessage = null;
        Product product = null;
        String prodtype = null;

        try {
            // Attempt to get the product by name
            product = getProductByName(prodName);
            prodtype = product.getProdtype();
        } catch (ProductNotFoundException e) {
            errorMessage = e.getMessage();

            // If product with the given name is not found, try to determine prodtype
            List<Product> sameBrandProducts = repo.findByBrand(brand);
            if (!sameBrandProducts.isEmpty()) {
                prodtype = sameBrandProducts.get(0).getProdtype();
            } else {
                // If no product of the same brand is found, fetch any product and use its prodtype
                List<Product> anyProduct = repo.findAll();
                if (!anyProduct.isEmpty()) {
                    prodtype = anyProduct.get(0).getProdtype();
                }
            }
        }

        if (prodtype != null) {
            // Get products of the same brand, excluding the specified product
            List<Product> sameBrandProducts = repo.findByBrandAndProdIdNotOrderByPriceAsc(brand, product != null ? product.getProdId() : -1);
            recommendations.addAll(sameBrandProducts);

            // If there are not enough products of the same brand, add products of the same type
            if (recommendations.size() < 3) {
                List<Product> sameTypeProducts = repo.findByProdtypeAndProdIdNotOrderByPriceAsc(prodtype, product != null ? product.getProdId() : -1);
                for (Product p : sameTypeProducts) {
                    if (recommendations.size() >= 3) {
                        break;
                    }
                    recommendations.add(p);
                }
            }

            // If still fewer than 3 products, add more products of the same type
            if (recommendations.size() < 3) {
                List<Product> additionalSameTypeProducts = repo.findByProdtypeOrderByPriceAsc(prodtype);
                for (Product p : additionalSameTypeProducts) {
                    if (recommendations.size() >= 3) {
                        break;
                    }
                    recommendations.add(p);
                }
            }
        }

        if (product == null) {
            return new RecommendationResponse(errorMessage, recommendations);
        } else {
            return new RecommendationResponse(product, recommendations);
        }
    }
}
