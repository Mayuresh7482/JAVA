package com.company;

import java.util.Scanner;

public class PS07 {
    //Problem no.1
    static void Mutliplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n" ,n ,i, n*i);
        }
        System.out.println("Problem no.1 solved");
    }
    //Problem no.2
    static void pattern(int n ){
        for(int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*  ");
            }
            System.out.println("         Problem no.2 solved");
        }
    }
    //Problem no.3
    static int sumRect(int n ){
        if(n==1){
            return 1;
        }
        return n + sumRect(n-1);
    }



    //Problem no.4
    static void pattern1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println("            Problem no.4 solved");
        }
    }
    //Problem no.5
    static int fib(int n){
        /*

        if (n==1){
            return 0;
        }
        else if(n==2){
            return  1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }

        */

        if(n==1||n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
        //Problem no.6

    public static double findAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }System.out.println("              Problem no.6 solved");
        return sum / numbers.length;
    }
    //Problem no.7
    static void patternRec(int n) {
        if (n > 0) {
            patternRec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*   ");
            }
            System.out.println("            Problem no.7 solved");

        }
    }

    //Problem no.8


    static void  CelsiusToFahrenheit(int n){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a temperature in Celsius: ");
            double celsius = input.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        System.out.println("Problem no.8 solved");
        }

 //Problem no. 9

    static int sumRect1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }System.out.println("       Problem no.9 solved");
        return sum;

    }

    public static void main(String[] args) {
        //Problem no.1

        Mutliplication(7);

        //Problem no.2

        pattern(5);

        //Problem no.3

        int c = sumRect(4);
        System.out.println("Sum of First natural is " + c);

        //Problem no.4

        pattern1(5);

        //Problem no.5

            int result = fib(7);
             System.out.println(result);

        //Problem no.6

        double[] myNumbers = {3.4, 5.2, 2.1, 9.8, 4.5};
        double average = findAverage(myNumbers);
        System.out.println("The average is: " + average);

        //Problem no.7

        patternRec(5);

        //Problem no.8

        CelsiusToFahrenheit(0);

        //Problem no.9

        int d = sumRect1(4);
        System.out.println("Sum of First natural is " + d);

    }
}
