package com.company;

class Base1 {
    Base1() {
        System.out.println("I am Constructor in Base");
    }

    Base1(int x) {
        System.out.println("I am Overloaded Constructor in Base with value x " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        //super(0);
        System.out.println("I am Constructor in Derived");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am Overloaded Constructor in Derived  with value y " + y);
    }
}

class Child extends Derived1 {
    Child() {
        System.out.println("Child in derived Constructor");
    }

    Child(int x, int y, int z) {
        super(x, y);
        System.out.println("I am Overloaded Constructor in Child  with value z " + z);
    }
}

public class E46ConstructorInheritance {
    public static void main(String[] args) {
        //Base1 b1 = new Base1();
        //Derived1 d1 = new Derived1();
        //Derived1 d1 = new Derived1(14,9);
        //Child c = new Child();
        Child c = new Child(12, 13, 15);

    }
}
