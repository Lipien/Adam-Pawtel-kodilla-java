package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        System.out.println(thePizza.getCost());
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Dough with cheese and tomato sauce", description);
    }

    @Test
    public void testPizzaSizeXlDecoratorGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaSizeXlDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testPizzaSizeXlDecoratorGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaSizeXlDecorator(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Dough with cheese and tomato sauce, XL size", description);
    }

    @Test
    public void testPizzaWith2AddOnsDecoratorGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaSizeXlDecorator(thePizza);
        thePizza = new PizzaWith2AddOnsDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testPizzaWith2AddOnsDecoratorGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaSizeXlDecorator(thePizza);
        thePizza = new PizzaWith2AddOnsDecorator(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Dough with cheese and tomato sauce, XL size, two add-ons", description);
    }

    @Test
    public void testPizzaHomeDeliveryDecoratorGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaSizeXlDecorator(thePizza);
        thePizza = new PizzaWith2AddOnsDecorator(thePizza);
        thePizza = new PizzaHomeDeliveryDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(32), calculatedCost);
    }

    @Test
    public void testPizzaHomeDeliveryDecoratorGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new PizzaSizeXlDecorator(thePizza);
        thePizza = new PizzaWith2AddOnsDecorator(thePizza);
        thePizza = new PizzaHomeDeliveryDecorator(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Dough with cheese and tomato sauce, XL size, two add-ons. Home delivery", description);
    }
}
