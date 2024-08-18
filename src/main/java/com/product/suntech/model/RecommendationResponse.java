package com.product.suntech.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class RecommendationResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Product product;
    private List<Product> recommendations;

    public RecommendationResponse(String errorMessage, List<Product> recommendations) {
        this.errorMessage = errorMessage;
        this.recommendations = recommendations;
    }

    public RecommendationResponse(Product product, List<Product> recommendations) {
        this.product = product;
        this.recommendations = recommendations;
    }

    // Getters and Setters
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Product> recommendations) {
        this.recommendations = recommendations;
    }
}
