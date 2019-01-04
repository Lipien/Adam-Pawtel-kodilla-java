package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

interface ProductOrderService {
    boolean isOrderAccepted(Customer customer, LocalDateTime orderDate, Product product, int productQty);
}
