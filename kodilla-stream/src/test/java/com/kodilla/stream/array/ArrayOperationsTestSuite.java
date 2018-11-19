package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test

    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers[i] = random.nextInt(100);
        }


        //When
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            sum = sum + numbers[i];
        }
        double expectedAverage = (double) sum / 20;

        //Then
        Assert.assertEquals(expectedAverage, ArrayOperations.getAverage(numbers), 0.000001);
    }

}