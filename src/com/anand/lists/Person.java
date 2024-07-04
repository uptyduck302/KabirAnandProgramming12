package com.anand.lists;

public class Person {
    int age;
    int id;

    public Person(int age, int id){
        this.age = age;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person other = (Person)obj;
            if(this.id == other.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "id: " + id + "\tAge: " + age;
    }
}