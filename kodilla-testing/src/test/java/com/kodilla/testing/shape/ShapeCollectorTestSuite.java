package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(4, "Circle");
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getshapesSeries().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(12, "Triangle");
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getshapesSeries().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(16, "Square");
        shapeCollector.addFigure(shape);
        //When
        Shape shapesSeries = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, shapesSeries);
    }

}