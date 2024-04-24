package com.codewithharry.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }

    public double area() {
        return area();
    }

    public double surfaceArea() {
        return 2 * area() + 2 * Math.PI * getRadius() * height;
    }

    public double getRadius() {
        double radius = 5;
        return radius;
    }
}
