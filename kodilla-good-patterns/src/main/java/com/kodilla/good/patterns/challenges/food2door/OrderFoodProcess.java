package com.kodilla.good.patterns.challenges.food2door;

public class OrderFoodProcess {
    private OrderRepository orderRepository;

    public OrderFoodProcess(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto run(Supplier supplier) {
        boolean isOrder = supplier.process();

        if (isOrder) {
            orderRepository.createOrder(supplier.getClass().getSimpleName(), supplier.getProductName(), supplier.getProductQty());
            return new OrderDto(supplier);
        } else {
            return new OrderDto(supplier);
        }
    }
}
