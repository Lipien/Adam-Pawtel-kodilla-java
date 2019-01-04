package com.kodilla.good.patterns.challenges;

abstract class Product {
    private String productNumber;
    private String productName;
    private double productPrice;

    public Product(String productNumber, String productName, double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return productName;
    }
}

