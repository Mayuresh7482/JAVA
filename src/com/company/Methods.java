package com.company;

public class Methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c = logic(a,b);

        System.out.println(c);

        //Method invocation using Object creation (Works if no static class is used)
        //Methods obj = new Methods();
        // c = obj.logic(a,b);

        int a1 = 2;
        int b1 = 1;
        int c1 = logic(a1,b1);

        System.out.println(c1);
    }
}
