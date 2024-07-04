package com.anand.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>(new CustomCompare());

        for(int i = 0; i < 10;i++){
            cars.add(new Car("id-" + Integer.toString(i), (int)(Math.random()*1000)));
        }
        for(Car c : cars){
            System.out.println(c);
        }
        System.out.println(cars.add(new Car("id-6",2323)));


    }
}