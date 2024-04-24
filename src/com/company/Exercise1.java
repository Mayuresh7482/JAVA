package com.company;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Eng Marks");
        float a = sc.nextInt();
        System.out.println("Enter Maths Marks");
        float b = sc.nextInt();
        System.out.println("Enter Science Marks");
        float c = sc.nextInt();
        System.out.println("Enter Chemistry Marks");
        float d = sc.nextInt();
        System.out.println("Enter Physics Marks");
        float e = sc.nextInt();
        float avg = ((a + b + c + d + e)/5);
        System.out.println("this is  your percentages: " + avg);
    }
}
