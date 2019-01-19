package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Dojazd do pracy", "Tarchomin", "Uber");
            case PAINTING:
                return new PaintingTask("Summer house renovation", "pink", "external walls");
            case SHOPPING:
                return new ShoppingTask("Carrefour", "fresh salmon", 2);
            default:
                return null;
        }
    }
}
