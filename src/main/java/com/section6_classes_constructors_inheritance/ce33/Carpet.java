package com.section6_classes_constructors_inheritance.ce33;

public class Carpet {

    double cost;

    public Carpet() {
    }

    public Carpet(double cost) {
        this.cost = (cost < 0 ? 0 : cost);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
