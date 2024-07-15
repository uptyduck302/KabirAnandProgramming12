package com.anand.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("After exception");

        try {
            AClass.calculation(-5);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("more stuff");
        }
    }
}
