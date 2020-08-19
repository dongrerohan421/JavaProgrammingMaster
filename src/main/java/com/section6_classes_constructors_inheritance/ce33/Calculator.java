package com.section6_classes_constructors_inheritance.ce33;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator() {
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}