package com.section6_classes_constructors_inheritance.ce35;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0 ? 0 : radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}