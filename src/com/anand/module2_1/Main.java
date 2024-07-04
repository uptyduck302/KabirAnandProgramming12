package com.anand.module2_1;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", PlanetType.TERRESTRIAL);
        Planet mars = new Planet("Mars", PlanetType.TERRESTRIAL);
        Planet jupiter = new Planet("Jupiter", 1.898e27, 11.86, PlanetType.GAS_GIANT);

        System.out.println(earth);
        System.out.println(mars);
        System.out.println(jupiter);

        System.out.println(earth.equals(mars));
        System.out.println(earth.hashCode());
        System.out.println(mars.hashCode());
        System.out.println(jupiter.hashCode());
    }
}
