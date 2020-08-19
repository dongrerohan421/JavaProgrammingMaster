package com.section6_classes_constructors_inheritance.ce33;

public class Floor {

    private double width;
    private double length;

    public Floor() {
    }

    public Floor(double width, double length) {
        this.width = (width < 0 ? 0 : width);
        this.length = (length < 0 ? 0 : length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

}
