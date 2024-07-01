package com.anand.module1_3;

public class Triangle extends TwoDShape implements Rotate {

    public Triangle() {
        super();
    }

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double a, double b, double c) {
        super();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        setHeight((2 * area) / a); // Using Heron's formula to set height
        setWidth(a); // Assuming a as the base
    }

    @Override
    public double getArea() {
        return (getWidth() * getHeight()) / 2;
    }

    @Override
    public void rotate90() {
        System.out.println("Triangle rotated 90 degrees.");
    }

    @Override
    public void rotate180() {
        System.out.println("Triangle rotated 180 degrees.");
    }

    @Override
    public void rotate(double degree) {
        System.out.println("Triangle rotated " + degree + " degrees.");
    }

    @Override
    public String toString() {
        return "Triangle [width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
