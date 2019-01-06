package com.kodilla.good.patterns.challenges.food2door;

public class SupplierExtraFoodShop implements Supplier {
    String supplierName;
    String productName;
    double productQty;

    public SupplierExtraFoodShop(String supplierName, String productName, double productQty) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.productQty = productQty;
    }

    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductQty() {
        return productQty;
    }

    @Override
    public boolean process() {
        System.out.println("Dear " + supplierName);
        System.out.println("Your offer for " + productQty + "pcs of " + productName + " has been accepted");
        System.out.println("For delivery use courier named Adrian");
        return true;
    }
}
