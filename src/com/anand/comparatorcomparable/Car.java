package com.anand.comparatorcomparable;

public class Car implements Comparable<Car>{
    int id;
    double price;

    public Car(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString(){
        return "id: " + id + "\tPrice: " + price;
    }
}
