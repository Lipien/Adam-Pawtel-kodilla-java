package com.kodilla.good.patterns.challenges;

public class OrdersDTO {
    public Customer customer;
    public boolean isInvoiced;

    public OrdersDTO(Customer customer, boolean isInvoiced) {
        this.customer = customer;
        this.isInvoiced = isInvoiced;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isInvoiced() {
        return isInvoiced;
    }
}
