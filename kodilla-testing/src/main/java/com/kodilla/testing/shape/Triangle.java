package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private int field;
    private String shapeName;

    public Triangle(int field, String shapeName) {
        this.field = field;
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        String shapeName = this.shapeName;
        return shapeName;
    }

    @Override
    public int getField() {
        int field = this.field;
        return field;
    }
}
