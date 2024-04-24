package com.company;

//q1
class Circle {
    public int radius;

    Circle() {
        System.out.println("Circle");
    }

    Circle(int r) {
        System.out.println("inside Circle ");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle {
    public int height;

    Cylinder1(int r, int h) {

        super(r);
        System.out.println("inside Cylinder");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

//q2

class Rectangle2 {
    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Cuboid extends Rectangle2 {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

public class Exercise10 {
    public static void main(String[] args) {

        //q1

        //Circle Objc = new Circle(12);
        Cylinder1 obj2 = new Cylinder1(12, 15);

        //q2

        // Create a rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle area: length * width " + rectangle.getArea());

        // Create a cuboid
        Cuboid cuboid = new Cuboid(5.0, 3.0, 2.0);
        System.out.println("Cuboid volume: length * width * height " + cuboid.getVolume());
    }
}
