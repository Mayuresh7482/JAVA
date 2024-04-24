package com.company;

class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i<40000) {
            System.out.println(" My thread is running");
            System.out.println(" and i am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i<40000) {
            System.out.println(" My thread2 is running");
            System.out.println(" and i am Sad ");
            i++;
        }
    }
}

public class E70Mutlithreading {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();
    }
}
