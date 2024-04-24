package com.company;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(" in base and setting x now");
        this.x = x;
    }

    public void printME() {
        System.out.println("I am Constructor");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class E45Inheritance {
    public static void main(String[] args) {
        //Base b = new Base();
        /*b.setX(4);
        /*b.setY(5); not there
        System.out.println(b.getX());*/
        Derived d = new Derived();
        d.setX(4);
        d.setY(43);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
