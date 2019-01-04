package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ToothBrushOrderService implements ProductOrderService {
    @Override
    public boolean isOrderAccepted(Customer customer, LocalDateTime orderDate, Product product, int productQty) {
        return true;
    }
}
