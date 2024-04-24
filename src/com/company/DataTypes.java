package com.company;

public class DataTypes {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 9;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(a);
        System.out.println(b);

        //Increment and decrement
        int i = 56;
        System.out.println(i++); //56++
        System.out.println(i);   //57
        System.out.println(++i); //++58
        System.out.println(i);   //58
        System.out.println(i--); //58--
        System.out.println(i);   //57
        System.out.println(--i); //--56
        System.out.println(i);   //56
        int y1 = 7;
        System.out.println( ++y1 * 8); //64
        char a1 = 'a';
        System.out.println(++a1);  //b
    }
}
