package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class ToothbrushOrdersRepository implements ProductOrdersRepository {
    @Override
    public boolean createProductOrder(Customer customer, LocalDateTime orderDate, Product product, int productQty) {
        return true;
    }
}
