package com.anand.Magicnumbers;

import java.util.Scanner;

public class HotDogStand {
    public static void magicNumbers(){
        System.out.println("How many hotdogs do you want?");
        Scanner scan = new Scanner(System.in);

        System.out.println("You total is: " + scan.nextInt() * 3.5 * 1.12);
    }
    public static void noMagicNumbers(){
        double hotDogPrice = 3.5;
        double tax = 1.12;
        int numberOfDogs = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many hot dogs do you want?");
        numberOfDogs = scan.nextInt();

        System.out.println("Your total is: " + numberOfDogs * hotDogPrice * tax);

    }
    public static void main(String[] args) {

    }
}
