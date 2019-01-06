package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    Supplier supplier;

    public OrderDto(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
