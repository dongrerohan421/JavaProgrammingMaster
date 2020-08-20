package com.section6_classes_constructors_inheritance.ce35;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0 ? 0 : height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

}