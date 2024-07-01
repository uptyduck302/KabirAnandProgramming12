package com.anand.module1_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new com_anand.module1_6.Circle(5, Colour.RED));
        shapes.add(new Triangle(3, 4, 5, Colour.GREEN));
        shapes.add(new Triangle(6, 8, Colour.BLUE));

        for (TwoDShape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
        }
    }
}
