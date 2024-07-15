package com.anand.exceptions;

public class AClass {
    public static int calculation(int num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Negative number cannot do whatever it is I want");
        } else {
            System.out.println("Rest of code");
            return num;
        }
    }
}
