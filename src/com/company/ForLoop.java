package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /* for(int i=0;i<=5;i++){
            System.out.println(i);
        }*/

        //2n =Even number =0,2,4,6,8
        //2n+1 =odd number =1,3,5,7,9

        /* int n = 6;
        for (int l = 0; l<n;l++){
            System.out.println("Odd numbers "+(2*l+1));
        }*/

        //Decrement
        /*int n = 10;
        for (int i = n; i>=0;i--){
            System.out.println("Odd numbers "+(2*i+1));
        }*/

        //Quiz first n natural num in reverse order
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("The first " + n + " natural numbers in reverse order are: ");
        for(int i=n; i>=1; i--){
            System.out.print(i + " ");
        }
    }
}
