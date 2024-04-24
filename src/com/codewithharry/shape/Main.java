package com.codewithharry.shape;



public class Main {
    public static <square> void main(String[] args) {
        // Create a circle with radius 4
        Circle circle = new Circle(4);

        // Calculate and print the area and circumference
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle circumference: " + circle.circumference());

       /* // Create a square with side length 6
        square square = new square();

        // Calculate and print the area and perimeter
        System.out.println("Square area: " + square.wait());
        System.out.println("Square perimeter: " + square.perimeter());*/

        // Create a rectangle with length 8 and width 10
        Rectangle rectangle = new Rectangle(12,12);

        // Calculate and print the area and perimeter
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        // Create a cylinder with radius 5 and height 10
        Cylinder cylinder = new Cylinder(5, 10);

        // Calculate and print the volume and surface area
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface area: " + cylinder.surfaceArea());

        // Create a sphere with radius 3
        Sphere sphere = new Sphere(3);

        // Calculate and print the volume and surface area
        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Sphere surface area: " + sphere.surfaceArea());
    }
}
