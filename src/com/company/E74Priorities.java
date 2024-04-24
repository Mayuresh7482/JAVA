package com.company;

class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 12) {
            System.out.println("i m thread" + this.getName());
            i++;
        }
    }
}

public class E74Priorities {
    public static void main(String[] args) {
        Mythr1 t = new Mythr1("Mayuresh1");
        Mythr1 t2 = new Mythr1("Ram chandr2");
        Mythr1 t3 = new Mythr1("Mayuresh3");
        Mythr1 t4 = new Mythr1("Ram chandr4");
        Mythr1 t5 = new Mythr1("Mayuresh5");
        Mythr1 t6 = new Mythr1("Ram (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
