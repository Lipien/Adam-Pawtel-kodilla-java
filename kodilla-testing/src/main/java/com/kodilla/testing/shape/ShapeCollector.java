package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector {


    ArrayList<Shape> shapesSeries = new ArrayList<Shape>();

    public ArrayList<Shape> getshapesSeries() {
        return shapesSeries;

    }

    public void addFigure(Shape shape) {
        shapesSeries.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapesSeries.remove(shape);

    }

    public Shape getFigure(int n) {
        return shapesSeries.get(n);

    }

    public void showFigures() {
        int i = 0;
        while (i != shapesSeries.size()) {
            System.out.println(shapesSeries.get(i));
            i++;

        }
    }

}