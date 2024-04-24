package com.company;

class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;

        while (i < 5) {
            System.out.println("i m thread");
            i++;
        }
    }
}

public class E73ConstfromThreadclass {
    public static void main(String[] args) {
        Mythr t = new Mythr("Mayuresh");
        Mythr t2 = new Mythr("Ram chandr");
        t.start();
        t2.start();
        System.out.println("the id of the thread is " + t.getId());
        System.out.println("the name of the thread is " + t.getName());
        System.out.println("the id of the thread is " + t2.getId());
        System.out.println("the name of the thread is " + t2.getName());
    }
}
