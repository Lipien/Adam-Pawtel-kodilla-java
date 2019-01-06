package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class CustomerProductOrdersCollector {

    public CustomerProductOrder orderToBeProcessed() {
        LocalDateTime orderDate = LocalDateTime.of(2019, 01, 04, 13, 23);
        String orderNumber = "000230/04/01/2019TB";
        Customer customer = new Customer("Jan", "Kowalski", "10-610", "Warszawa", "Ludowa 1");
        Product product = new Toothbrush("C1234BA", "Electric Toothbrush by COLGATE", 99.99);
        int productQty = 200;

        System.out.println("New order to be processed:" + orderNumber);

        return new CustomerProductOrder(orderDate, orderNumber, customer, product, productQty);


    }
}
