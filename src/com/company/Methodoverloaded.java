package com.company;

public class Methodoverloaded {
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int []arr){
        arr[0] = 88;
    }
    static void telljoke(){
        System.out.println(" I invented a new word!\n" + "Plagiarism!");
    }
    public static void main(String[] args) {
        foo();
        foo(1000);
        foo(3000,4000); //Arguments
        telljoke();

            //changing the integer
        /*

            int x = 45;
            change(x);
            System.out.println("the value of x after running change is " + x);

         */

        int[] marks = {52,36,5,48,24};
        change2(marks);
        System.out.println("the value of marks after running change is " + marks[0]);
    }
}
