package com.kodilla.good.patterns.challenges.food2door;

public class ApplicationFood2Door {
    public static void main(String[] args) {
        OrderLoad orderLoad = new OrderLoad();
        Supplier supplier = orderLoad.load("pizza");
        OrderFoodProcess orderFoodProcess = new OrderFoodProcess(new OrderRepository());
        orderFoodProcess.run(supplier);
    }
}
