package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println(" ");
        System.out.println("Zadanie: Upiększacz tekstów:");
        System.out.println(" ");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text Text Text", (String::toUpperCase));
        poemBeautifier.beautify("Text Text Text", text -> text.toLowerCase());
        poemBeautifier.beautify("Text Text text", (text -> "***" + text + "***"));
        poemBeautifier.beautify("TEXT IN CAGES", (text -> {
            StringBuilder textStringBuilt = new StringBuilder();
            textStringBuilt.append("|");
            for (int i = 0; i < text.length(); i++) {
                textStringBuilt.append(text.charAt(i));
                textStringBuilt.append("|");
            }
            return textStringBuilt.toString();

        }));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
