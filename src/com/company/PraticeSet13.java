package com.company;

class Pratice13 extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning " + this.getName());
            i++;
        }
    }
}

class Pratice1302 extends Thread {

    public void run() {
        int i = 0;
        /*while (false) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome " + this.getName());
            i++;
        }*/
    }
}

public class PraticeSet13 {
    public static void main(String[] args) {
        Pratice13 p = new Pratice13();
        p.setPriority(6);
        Pratice1302 p2 = new Pratice1302();
        p2.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(p.getState());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
       /* p.start();*/
        p2.start();
    }
}
