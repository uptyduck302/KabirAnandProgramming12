package com.anand.maps;

public class Owner {
    String name;

    Owner(){
        String alpha = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        String generator = "";
        for(int i = 0; i < 8;i++){
            int num = (int)(Math.random()*alpha.length());
            generator += alpha.charAt(num);
        }
        name = generator;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Owner){
            Owner other = (Owner)obj;
            if(this.name.equals(other.name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}