package com.company;

import java.util.Scanner;

public class PraticeSet14Errors {
    //    public static void main(String[] args) {
//        // Problem 1
//        // Syntax Error - int a = 7
//        int age = 78;
//        int year_born = 2000 - 78; // Logical error
//// System.out.println(6/0);
//        // Problem 2
//        try {
//            int a = 666 / 0;
//        } catch (IllegalArgumentException e) {
//            System.out.println("HeHe");
//        } catch (ArithmeticException e) {
//            System.out.println("Haha");
//        }
    //Problem 3
/*boolean flag = true;
    int [] marks = new int[3];
    marks[0] = 7;
    marks[1] = 56;
    marks[2] = 6;
    Scanner Sc = new Scanner(System.in);
    int index;
    int i = 0;
 while(flag && i<5){
        try {
            System.out.println("Enter the value of
                    index");
                    index = Sc.nextInt();
            System.out.println("The value of
                    marks[index] is " + marks[index]);
            break;
        }
        catch (Exception e) {
            System.out.println("Invalid Index");
            i++;
        }
    }
 if(i>=5){
        System.out.println("Error");
    }*/
    // Problem 4 & 5
    private static final int MAX_RETRIES = 5;

    public static void main(String[] args) {
        int[] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);

        try {
            int mark = getMark(sc, marks);
            System.out.println("The value of marks[index] is " + mark);
        } catch (MaxRetriesReachedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int getMark(Scanner sc, int[] marks) throws MaxRetriesReachedException {
        boolean flag = true;
        int index;
        int i = 0;

        while (flag && i < MAX_RETRIES) {
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                return marks[index];
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }

        throw new MaxRetriesReachedException("Maximum retries reached.");
    }
}

class MaxRetriesReachedException extends Exception {
    public MaxRetriesReachedException(String message) {
        super(message);
    }
}




