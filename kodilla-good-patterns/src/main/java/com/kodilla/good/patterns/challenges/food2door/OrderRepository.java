package com.kodilla.good.patterns.challenges.food2door;

public class OrderRepository {
    public boolean createOrder(String supplierName, String productName, double productQty) {
        System.out.println("Food2Door confirms order " + productQty + " of " + productName + " from " + supplierName);
        return true;
    }
}
