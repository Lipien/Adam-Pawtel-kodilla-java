package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(4, 2);
        double subResult = calculator.sub(3, 12);
        double mulResult = calculator.mul(8, 4);
        double divResult = calculator.div(3, 15);

        //Then
        Assert.assertEquals(6, addResult, 0);
        Assert.assertEquals(9, subResult, 0);
        Assert.assertEquals(32, mulResult, 0);
        Assert.assertEquals(5, divResult, 0);
    }
}
