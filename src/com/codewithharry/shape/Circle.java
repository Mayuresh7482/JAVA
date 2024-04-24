package com.codewithharry.shape;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        int radius = 10;
        return 2 * Math.PI * radius;
    }

}
