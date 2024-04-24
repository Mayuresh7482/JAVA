package com.company;

//q1
class Cylinder {
    private int radius;
    private int height;

    //q3
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

//q4
class Rectangle1 {
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public sphere(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(){
        return 4 * Math.PI * radius*radius;
    }

}
public class E44PS09 {
    public static void main(String[] args) {
/*
        // q1
        //Cylinder myCylinder = new Cylinder();

        //q3
        Cylinder myCylinder = new Cylinder(9,12);

        //myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);

        //myCylinder.setRadius(9);
        int ra = myCylinder.getRadius();
        System.out.println(ra);

        //q2

        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());*/

        //q4

        Rectangle1 r = new Rectangle1(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        //q5

        sphere S = new sphere(10);
        System.out.println(S.getRadius());
    }
}
