package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            System.out.println("The arguments of the method should be consistent with the following record: x >= 2 || x < 1 || y == 1.5.");
        } finally {
            System.out.println("First, read the manual...");
        }
    }
}
