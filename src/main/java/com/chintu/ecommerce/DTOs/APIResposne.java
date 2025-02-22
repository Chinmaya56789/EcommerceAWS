package com.chintu.ecommerce.DTOs;

import com.chintu.ecommerce.Models.Product;

public class APIResposne {
    private int status;
    private Product product;

    public APIResposne(int status, Product product) {
        this.status = status;
        this.product = product;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Product getProduct() {

        return product;
    }

    @Override
    public String toString() {
        return "APIResposne{" +
                "status=" + status +
                ", product=" + product.toString() +
                '}';
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
