package com.anand.module1_3;

public class Circle extends TwoDShape {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double getArea() {
        double radius = getWidth();
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + getWidth() + "]";
    }
}
