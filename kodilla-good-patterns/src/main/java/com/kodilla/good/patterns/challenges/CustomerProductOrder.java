package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CustomerProductOrder {

    private LocalDateTime orderDate;
    private String orderNumber;
    private Customer customer;
    private Product product;
    private int productQty;

    public CustomerProductOrder(LocalDateTime orderDate, String orderNumber, Customer customer, Product product, int productQty) {
        this.orderDate = orderDate;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.product = product;
        this.productQty = productQty;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQty() {
        return productQty;
    }
}
