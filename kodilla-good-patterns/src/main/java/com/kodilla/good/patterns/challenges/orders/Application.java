package com.kodilla.good.patterns.challenges.orders;

public class Application {
    public static void main(String[] args) {

        CustomerProductOrdersCollector customerProductOrdersCollector = new CustomerProductOrdersCollector();
        CustomerProductOrder customerProductOrder = customerProductOrdersCollector.orderToBeProcessed();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ToothBrushOrderService(), new ToothbrushOrdersRepository());

        orderProcessor.process(customerProductOrder);
    }
}
