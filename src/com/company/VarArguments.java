package com.company;

public class VarArguments {
    /*static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a,int b,int c){
        return a + b + c;
    }*/
    static int sum(int x,int ...arr){
        //Avaible as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Variable Arguments");
        //System.out.println("the sum of is null " + sum()); int  x
        System.out.println("the sum of is null " + sum(1)); //int x
        System.out.println("the sum of 4 and 5 is " + sum(4,5));
        System.out.println("the sum of 4 and 5 and 6 is " + sum(4,5 ,6));
    }
}
