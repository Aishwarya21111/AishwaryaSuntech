package com.product.suntech.repository;

import com.product.suntech.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByProdName(String prodName);
    List<Product> findByBrand(String brand);
    List<Product> findByBrandAndProdIdNotOrderByPriceAsc(String brand, int prodId);
    List<Product> findByProdtypeAndProdIdNotOrderByPriceAsc(String prodtype, int prodId);
    List<Product> findByProdtypeOrderByPriceAsc(String prodtype);
    List<Product> findByProdtype(String prodtype);
}
