package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }

    public double add(double a, double b) {
        final double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        final double val = b - a;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        final double val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        final double val = b / a;
        display.displayValue(val);
        return val;
    }
}
