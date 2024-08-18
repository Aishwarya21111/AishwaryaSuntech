package com.product.suntech.controller;

import com.product.suntech.ProductNotFoundException;
import com.product.suntech.model.Product;
import com.product.suntech.model.RecommendationResponse;
import com.product.suntech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    // Home Page
    @RequestMapping(value = {"", "/", "/home"})
    public String displayHomePage(Model model) {
        return "Home.html";
    }

    // About Page
    @RequestMapping("/about")
    public String displayAboutPage(Model model) {
        return "About.html";
    }

    // Contact Page
    @RequestMapping("/contact")
    public String displayContactPage(Model model) {
        return "Contact.html";
    }

    // Get Products Page
    @RequestMapping("/get")
    public String getProd(
            @RequestParam(required = false) Integer prodId,
            @RequestParam(required = false) String prodName,
            @RequestParam(required = false) String prodtype,
            Model model) {

        List<Product> products = service.getProduct(prodId, prodName, prodtype);
        if (products == null) {
            products = new ArrayList<>();
        }
        model.addAttribute("products", products);
        return "get.html";
    }



    // Add Product Page
    @RequestMapping("/add")
    public String displayAddPage(Model model) {
        return "Add.html";
    }
    @PostMapping("/add")
    public String handleAddProduct(
            @RequestParam String prodName,
            @RequestParam Integer price,
            @RequestParam String prodtype,
            @RequestParam String brand,
            @RequestParam String imageFileName,
            Model model) {

        // Create and save the product
        Product newProduct = new Product();
        newProduct.setProdName(prodName);
        newProduct.setPrice(price);
        newProduct.setProdtype(prodtype);
        newProduct.setBrand(brand);
        newProduct.setImageFileName(imageFileName);
        service.addProduct(newProduct);

        // Add the product to the model to display it
        model.addAttribute("product", newProduct);
        return "Add.html"; // Reload the same page to show the added product
    }



    // Delete Product Page
    @GetMapping("/delete")
    public String showDeletePage() {
        return "delete";
    }


    @DeleteMapping("/delete")
    public String deleteProduct(@RequestParam("prodId") Integer prodId, Model model) {
        Product product = service.getProductById(prodId);
        if (product != null) {
            service.deleteProduct(prodId);
            model.addAttribute("product", product);
        } else {
            model.addAttribute("error", "Product not found");
        }
        return "delete";
    }

    // Update Product Page
    @GetMapping("/update")
    public String showUpdatePage() {
        return "update";
    }

    // Handle update request
    @PutMapping("/update")
    public String updateProduct(@RequestParam("prodId") Integer prodId,
                                @RequestParam("prodName") String prodName,
                                @RequestParam("price") Integer price,
                                @RequestParam("prodtype") String prodtype,
                                @RequestParam("brand") String brand,
                                @RequestParam("imageFileName") String imageFileName) {
        // Assuming `updateProduct` takes these parameters and updates the product
        Product updatedProduct = new Product(prodId, prodName, price, prodtype, imageFileName, brand);
        service.updateProduct(updatedProduct);
        return "redirect:/get"; // Redirect to the get page after update
    }

    // Recommend Products Page
    @GetMapping("/recommend")
    public String getRecommendations(@RequestParam(required = false) String prodName,
                                     @RequestParam(required = false) String brand,
                                     Model model) {
        if (prodName == null && brand == null) {
            model.addAttribute("errorMessage", "Please provide either a product name or a brand.");
            return "recommend";
        }

        RecommendationResponse response = service.getRecommendations(prodName, brand);
        model.addAttribute("errorMessage", response.getErrorMessage());
        model.addAttribute("recommendations", response.getRecommendations());
        return "recommend";
    }

    @RequestMapping("/search")
    public String searchProducts(
            @RequestParam("search") String search,
            Model model) {

        List<Product> products = service.getProduct(null, search, null);
        if (products.isEmpty()) {
            // If no product is found by name, search by product type
            products = service.getProduct(null, null, search);
        }

        model.addAttribute("products", products);
        return "get.html"; // Return the same view as the 'Get' page
    }

}
