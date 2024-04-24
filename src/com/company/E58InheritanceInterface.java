package com.company;

interface sampleInterface {
    void meth1();

    void meth2();
}

interface ChildSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MysampleClass implements ChildSampleInterface {
    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth3() {
        System.out.println("Meth3");
    }

    public void meth4() {
        System.out.println("Meth4");
    }
}

public class E58InheritanceInterface {
    public static void main(String[] args) {
        MysampleClass obj = new MysampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
