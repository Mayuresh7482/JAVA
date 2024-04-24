package com.company;

public class ArrayForEach {
    public static void main(String[] args) {
        //int [] marks = {98,45,65,35,78,54};
        /*float [] marks = {98.0f,45.86f,65.12f,35.25f,78.02f,54.36f};
        System.out.println(marks.length);
        System.out.println(marks[0]);*/
        String [] stu = {"Mayur" , "Rohan" ,"Shubh"};
        System.out.println(stu.length);
        System.out.println(stu[1]);

        //Displayed the array by for loop
        int [] marks = {98,45,65,35,78,54};
        for(int i=0;i<marks.length;i++){
            System.out.println("In order "+marks[i]);
        }

        for(int i=marks.length-1;i>=0;i--){
            System.out.println("Reverse order "+marks[i]);
        }
        for(int element: marks){
            System.out.println(element);
        }

    }
}
