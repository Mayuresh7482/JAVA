package com.company;

import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
        //q1 (a == 11 should be there )
        /*int a = 10 ;
        if(a = 11){
            System.out.println(" i m 11");
        }else
            System.out.println(" i m not 11");
    }*/
        //q2
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur marks for sub 1");
        int Marks1 = sc.nextInt();
        System.out.println("Enter ur marks for sub 2");
        int Marks2 = sc.nextInt();
        System.out.println("Enter ur marks for sub 3");
        int Marks3 = sc.nextInt();
        float Total = (Marks1 + Marks2 + Marks3)/3.0f;
        System.out.println("Your overall percentage is: "+Total);
        if(Total >=40 && Marks1>=33 && Marks2>=33 && Marks3>=33){
            System.out.println("your are passed ");
        }else {
            System.out.println("your are failed");

        }*/
        //q3
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<=2.5f){
            tax = tax + 0;
        }
        else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }
        else if (income > 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income - 2.5f);
        }
        System.out.println("your tax paying amount is :" + tax);*/
        //q4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/
            //q5
        // year to be checked
       /* int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");*/
    //q6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("Organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("Commercial website");
        }else if (website.endsWith(".in")) {
            System.out.println("Indian website");
        }
    }

    }
