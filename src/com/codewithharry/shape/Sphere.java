package com.codewithharry.shape;

public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double volume() {
        return 4.0 / 3.0 * Math.PI * getRadius() * getRadius() * getRadius();
    }

    public double getRadius() {
        double radius = 5;
        return radius;
    }

    public double surfaceArea() {
        return 4 * area();
    }

    public double area() {
        return area();
    }
}
