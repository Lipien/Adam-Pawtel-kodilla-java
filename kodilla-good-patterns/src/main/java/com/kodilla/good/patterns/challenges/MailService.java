package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void informCustomer(CustomerProductOrder customerProductOrder) {
        System.out.println(" ");
        System.out.println("Message sent to customer:");
        System.out.println("Dear Customer, thank you for ordering: " + customerProductOrder.getProduct());
        System.out.println(" ");
    }
}
