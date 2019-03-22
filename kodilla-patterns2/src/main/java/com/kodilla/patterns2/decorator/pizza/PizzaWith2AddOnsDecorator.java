package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWith2AddOnsDecorator extends AbstractPizzaOrderDecorator {
    public PizzaWith2AddOnsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", two add-ons";
    }
}
