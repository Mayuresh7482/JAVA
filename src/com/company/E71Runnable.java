package com.company;

class MythreadRunnable implements Runnable {
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("Thread 1");
            i++;
        }

    }
}
    class MythreadRunnable2 implements Runnable {
        public void run() {
            int i = 0;
            while (i < 15) {
                System.out.println("Thread 2");
                i++;
            }
        }
    }


public class E71Runnable {
    public static void main(String[] args) {
        MythreadRunnable bullet1 = new MythreadRunnable();
        Thread gun1 = new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
