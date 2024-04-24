package com.company;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age");
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("u r 18");
            case 21 -> System.out.println("u r 21");
            case 24 -> System.out.println("u r 24");
            case 30 -> System.out.println("u r 30");
            default -> { System.out.println("enjoy ur life");}
        }

        /*if (age>60){
            System.out.println("you are old ");
        }
        else if(age>30){
            System.out.println("experinced");
        } else if (age>25) {
            System.out.println("fresher");
        } else {
            System.out.println("you are in clg");
        }*/
    }
}
