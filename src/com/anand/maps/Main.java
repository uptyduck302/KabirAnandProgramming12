package com.anand.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Car, Owner> carMap = new TreeMap<>();

        for(int i = 0; i < 10;i++){
            carMap.put(new Car("id-" + i, (int)(Math.random()*1000)),new Owner());
        }

        Iterator<Car> carIterator = carMap.keySet().iterator();
        while(carIterator.hasNext()){
            Car c = carIterator.next();
            System.out.println("Car " + c + "\tOwner " + carMap.get(c));
        }
        Car car = new Car("id",500);
        Iterator<Car> carIterator1 = carMap.headMap(car).keySet().iterator();

        System.out.println("HEADMAP");
        while(carIterator1.hasNext()){
            Car c = carIterator1.next();
            System.out.println("car: " + c + "owner " + carMap.get(c));
        }
    }
}