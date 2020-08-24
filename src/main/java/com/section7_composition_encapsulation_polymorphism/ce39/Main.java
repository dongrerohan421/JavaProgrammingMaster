package com.section7_composition_encapsulation_polymorphism.ce39;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Accord accord = new Accord("Accord", 6);
        System.out.println(accord.getName());
        System.out.println(accord.startEngine());
        System.out.println(accord.accelerate());
        System.out.println(accord.brake());

        Civic civic = new Civic("Civic", 4);
        System.out.println(civic.getName());
        System.out.println(civic.startEngine());
        System.out.println(civic.accelerate());
        System.out.println(civic.brake());
    }

}