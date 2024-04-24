package com.company;

import java.util.Scanner;

public class PraticeSet01 {
    public static void main(String[] args) {
        // q1
        int a = 3;
        int b = 4;
        int c = 6;
        int sum = a + b + c;
        System.out.println(sum);
        //q2
        float sub1 = 45;
        float sub2 = 54;
        float sub3 = 68;
        float cgpa = ((sub1 + sub2 +sub3)/30);
        System.out.println(cgpa);
        //q3
        System.out.println("What is your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a nice day");
        //q4
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter km");
        float km = sc1.nextFloat();
        float miles = (float) (km*0.621371);
        System.out.println(miles);
        //q5
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number");
        System.out.println(sc2.hasNextInt());

    }
}
