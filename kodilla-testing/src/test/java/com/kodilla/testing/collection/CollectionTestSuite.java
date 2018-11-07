package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    private static OddNumbersExterminator oddNumbersExterminator;

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminateNumbers(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(emptyList, evenNumbers);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> fullMixedList = new ArrayList<>();
        fullMixedList.add(44);
        fullMixedList.add(23);
        fullMixedList.add(30);
        fullMixedList.add(5);
        fullMixedList.add(99);
        fullMixedList.add(80);
        fullMixedList.add(13);

        ArrayList<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(44);
        expectedResultList.add(30);
        expectedResultList.add(80);
        //When
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminateNumbers(fullMixedList);
        System.out.println("Testing fullMixedList");
        //Then
        Assert.assertEquals(expectedResultList, evenNumbers);
    }
}
