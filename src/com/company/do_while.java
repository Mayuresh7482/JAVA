package com.company;

public class do_while {
    public static void main(String[] args) {
        int a = 0;
        while (a<5){
            System.out.println("While loop "+a);
            a++;
        }
        int b = 10;
        do{
            System.out.println("do - While loop "+b);
            b++;
        }while (b<5);

    }
}
