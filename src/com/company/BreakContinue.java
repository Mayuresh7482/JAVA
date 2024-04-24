package com.company;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break and Continue using loops");

        /*int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("java is great");
        if (i == 2) {
            System.out.println("Ending the loop");
            break;
        }
        }*/

        /*int i=0;
        while (i < 5) {
            System.out.println(i);
            System.out.print("java is great ");
        if (i == 2) {
            System.out.println("Ending the with if loop");
            break;
        }
        i++;
        }
        System.out.println("loop ends here");*/

        //Continue
        for(int i=0;i<5;i++){
            if (i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is grt ");
        }
    }
}
