package com.kodilla.good.patterns.challenges.food2door;

public class OrderLoad {
    public Supplier load(String productName) {

        if (productName == "burger") {
            return new SupplierExtraFoodShop("ExtraFoodShop", "burger", 10);
        } else if (productName == "sushi") {
            return new SupplierHealthyShop("HealthyShop", "sushi", 20);
        } else if (productName == "pizza") {
            return new SupplierGlutenFreeShop("GlutenFreeShop", "pizza", 10);
        } else {
            System.out.println("Today we don't place any order.");
        }
        return null;
    }
}
