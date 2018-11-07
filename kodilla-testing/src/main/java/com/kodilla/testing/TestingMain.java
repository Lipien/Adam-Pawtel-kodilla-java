package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        Integer resultAdd = calculator.add(4, 5);
        if (resultAdd.equals(9)) {
            System.out.println("test2 OK");
        } else {
            System.out.println("Error");
        }

        Integer resultSubstract = calculator.substract(22, 2);

        if (resultSubstract.equals(20)) {
            System.out.println("test3 OK");
        } else {
            System.out.println("Error");
        }

    }
}
