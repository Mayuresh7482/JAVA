package com.company;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /*String name  = new String("Mayuresh");
        String num = "Mayur";
        System.out.println(name);
        System.out.println(num);*/
        int a = 6;
        float b = 5.6432f;
        System.out.printf("The value of a id %d and value of b is %f ",a,b);
        System.out.printf("The value of a id %d and value of b is %.2f ",a,b);
        System.out.printf("The value of a id %d and value of b is %8.2f ",a,b);
        System.out.format("The value of a id %d and value of b is %f ",a,b);
        Scanner sc =  new Scanner(System.in);
        //String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
