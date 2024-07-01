package com_anand.module1_6;

import com.anand.module1_4.Colour;
import com.anand.module1_4.TwoDShape;

// Class representing a circle, extending TwoDShape
public class Circle extends TwoDShape {

    // Constructor with radius and colour
    public Circle(double radius, Colour colour) {
        super(radius, radius, colour);
    }

    // Calculate and return the area of the circle
    @Override
    public double getArea() {
        double radius = getWidth();
        return Math.PI * radius * radius;
    }

    // Return a string representation of the circle
    @Override
    public String toString() {
        return "Circle [radius=" + getWidth() + ", colour=" + getColour() + "]";
    }
}
