package com.company;

class Ekclass {

    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a) {
        this.a = a;
    }

    public int returnOne() {
        return 1;
    }
}

class Doclass extends Ekclass {

    Doclass(int c) {
        super(c);
        System.out.println("Const in Doclass");
    }
}

public class E47ThisSuper {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(15);
        Doclass dc = new Doclass(54);
        System.out.println(e.getA());
    }
}
