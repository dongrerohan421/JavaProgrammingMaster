package com.section7_composition_encapsulation_polymorphism.ce39;

public class Civic extends Car {

    public Civic(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String accelerate() {
        return super.getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return super.getName() + " is applying brakes";
    }

    @Override
    public String startEngine() {
        return super.getName() + " engine started";
    }

}