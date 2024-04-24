package com.company;
abstract class  Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){

        System.out.println("My name is Java in class 1");
    }

    public abstract void showTime();
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Welcome to java");
    }
    public void name(){
        System.out.println("My name is Java in class 2");
    }

    @Override
    public void showTime() {

    }
}
public class E49DynamicDispatch {
    public static void main(String[] args) {
        /*Phone obj = new Phone();
        obj.name();
        SmartPhone sp = new SmartPhone();*/
        Phone obj = new SmartPhone();
        obj.greet();
        obj.name();
        //obj.swagat();
    }
}
