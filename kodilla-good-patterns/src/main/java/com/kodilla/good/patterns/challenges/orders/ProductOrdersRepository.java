package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public interface ProductOrdersRepository {
    boolean createProductOrder(Customer customer, LocalDateTime orderDate, Product product, int productQty);
}
