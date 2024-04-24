package com.company;

public class PS06 {
    public static void main(String[] args) {

        //Practice Problem 1

        /*

        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        */

        //Practice Problem 2

        /*

        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float num = 45.7f;
        boolean isINArray = false;
        for (float element:marks){
            if (num==element){
                isINArray =true;
                break;
            }
        }
        if (isINArray) {
            System.out.println("The value is  present in array " + num);
        }
        else {
            System.out.println("The value is not present in array " + num);
        }

        */

        //Practice Problem 3

        /*

        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of avg marks is " + sum/marks.length);

        */

        //Practice Problem 4

        /*

        int [] [] mat1 = {{1,2,3},{4,5,6}};
        int [] [] mat2 = {{8,6,9},{22,6,17}};
        int [] [] results = {{0,0,0},{0,0,0}};
        for (int i = 0 ; i<mat1.length;i++){
            for (int j = 0 ; j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d an j=%d\n ",i,j);
                results[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0 ; i<mat1.length;i++){
            for (int j = 0 ; j<mat1[i].length;j++){
                System.out.print(results[i][j] + " ");
                results[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }

        */

        //Practice Problem 5 (most imp reverse array)

        /*

        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n  = Math.floorDiv(l,2);
        int temp;

        for(int i=0;i<n;i++){
            //Swap a[i] and a[l-1-i]
            //a b temp
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] =temp;
        }

        for (int element:arr) {
            System.out.print(element + " ");
        }

        */

        //Practice Problem 6

        /*

        int [] arr = {1,21,-34,41,53,-67,543};
        int max = Integer.MIN_VALUE ;
        for (int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The max value of the element is : " + max);

        */

        //Practice Problem 7

        /*

        int [] arr = {10,-21,-34,41,53,-67,543};
        int min = Integer.MAX_VALUE ;
        for (int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The max value of the element is : " + min);

        */

        //Practice Problem 8

        boolean isSorted = true;
        int [] arr = {10,21,34,41,53,67,543};
        for(int i = 0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted now ");
        }
        else {
            System.out.println("The Array is not Sorted "); //if negative
        }
    }
}
