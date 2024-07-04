package com.anand.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            cars.add(new Car(i, (int)(Math.random()*10000)));
        }

        for(Car car : cars){
            System.out.println(car);
        }

        Collections.sort(cars);
        System.out.println("**********SORTED***************");
        for(Car car : cars){
            System.out.println(car);
        }

        System.out.println("**********CUSTOM***************");
        CustomComparator c = new CustomComparator();
        Collections.sort(cars, c);
        for(Car car : cars){
            System.out.println(car);
        }
    }
}
