package com.anand.module1_4;

public abstract class TwoDShape {
    private double width;
    private double height;
    private Colour colour;

    // Default constructor
    public TwoDShape() {
        this.width = 0;
        this.height = 0;
        this.colour = Colour.NONE;
    }

    // Constructor with width, height, and colour
    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for colour
    public Colour getColour() {
        return colour;
    }

    // Setter for colour
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    // Abstract method to get area of the shape
    public abstract double getArea();

    @Override
    public String toString() {
        return "TwoDShape [width=" + width + ", height=" + height + ", colour=" + colour + "]";
    }
}
