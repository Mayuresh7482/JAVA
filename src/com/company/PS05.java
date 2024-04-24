package com.company;

import java.util.Scanner;

public class PS05 {
    public static void main(String[] args) {

        //q1 (for loop)

        /*int n = 4;
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //q2  (for loop)

        /*int sum = 0;
        int n = 3;
        for (int i = 0;i < n;i++){
            sum = sum +(2*i);
        }
        System.out.print("Sum of Even number is: ");
        System.out.println(sum); */// 0 2 4 = 6

        //q3 (for loop)

        /*int n = 5;
        //for(int i = 0 ; i < 10 ; i++) -Goes from  i = 0 to i = 9
        for(int i = 1 ; i <= 10 ; i++){
            System.out.printf("%d X %d = %d\n", n , i,n *i);
        }*/

        //q4 (for loop)

        /*int n = 4;
        //for(int i = 10 ; i >0 ; i--) -Goes from  i = 0 to i = 9
        for(int i = 10 ; i >= 1 ; i--){
            System.out.printf("%d X %d = %d\n", n , i,n *i);
        }*/

        //q5 (What is factorial 4*3*2*1 = 24 for 4) by for loop

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);*/

        //q6  (What is factorial 4*3*2*1 = 24 for 4) by for While loop

        /*int n = 5;
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of "+n+" is " + factorial);*/

        //q7 (while loop)

        /*int n = 4;
        int i = n;

        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }*/

        //q8 (8 + 16 + 24 + 32 + 40 + 48 + 56 + 64 + 72 + 80) = 440 (for loop)

        /*int n = 8;
        int sum = 0;
        //for(int i = 10 ; i >0 ; i--) -Goes from  i = 0 to i = 9
        for(int i = 1 ; i <= 10 ; i++){
            sum += n*i;
        }
        System.out.println(sum);*/
        
        //q9  (while loop)
        
        int sum = 0;
        int n = 3;
        int  i = 0;
        while (i < n){
            sum = sum +(2*i);
            sum++;
            i++;
        }
        System.out.print("Sum of Even number is: ");
        System.out.println(sum);
    }
}
