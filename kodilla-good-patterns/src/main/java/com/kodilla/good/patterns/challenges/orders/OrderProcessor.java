package com.kodilla.good.patterns.challenges.orders;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrdersRepository productOrdersRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final ProductOrdersRepository productOrdersRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrdersRepository = productOrdersRepository;
    }

    public OrdersDTO process(final CustomerProductOrder customerProductOrder) {
        boolean isInvoiced = productOrderService.isOrderAccepted(customerProductOrder.getCustomer(),
                customerProductOrder.getOrderDate(),
                customerProductOrder.getProduct(),
                customerProductOrder.getProductQty());
        System.out.println("Is order accepted: " + isInvoiced);

        if (isInvoiced) {
            informationService.informCustomer(customerProductOrder);
            productOrdersRepository.createProductOrder(customerProductOrder.getCustomer(),
                    customerProductOrder.getOrderDate(),
                    customerProductOrder.getProduct(),
                    customerProductOrder.getProductQty());
            System.out.println("New order stored in order repository: " + customerProductOrder.getOrderNumber());
            return new OrdersDTO(customerProductOrder.getCustomer(), true);
        } else {
            return new OrdersDTO(customerProductOrder.getCustomer(), false);
        }
    }
}
