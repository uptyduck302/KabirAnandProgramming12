package com.anand.maps;

public class Car implements Comparable<Car>{
    String id;
    double price;

    public Car(String id, double price) {
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
        return "id: " + id + "Price: " + price;
    }

    @Override
    public int compareTo(Car o) {
        if(this.price > o.price){
            return -1;
        }
        else if (this.price < o.price){
            return 1;
        }
        return 0;
    }
}