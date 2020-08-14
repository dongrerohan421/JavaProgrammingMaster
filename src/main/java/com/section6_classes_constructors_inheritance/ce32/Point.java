package com.section6_classes_constructors_inheritance.ce32;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(new Point());
    }

    public double distance(int x, int y) {
        return distance(new Point(x, y));
    }

    public double distance(Point point) {
        double deltaX = Math.abs(this.x - point.getX());
        double deltaY = Math.abs(this.y - point.getY());
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}