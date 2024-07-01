package com.anand.module1_2;

public abstract class TwoDShape {
    private double width;
    private double height;

    public TwoDShape() {
        width = 0;
        height = 0;
    }

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "TwoDShape [width=" + width + ", height=" + height + "]";
    }
}
