package com.anand.sets;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    String id;
    int price;

    public Car(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car){
            Car other = (Car)obj;
            if(this.id.equals(other.id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Id: " + id + " \tPrice: " + price;
    }

    @Override
    public int compareTo(Car o) {
        if(this.price < o.price){
            return 1;
        }
        else if(this.price > o.price){
            return -1;
        }
        return 0;
    }
}