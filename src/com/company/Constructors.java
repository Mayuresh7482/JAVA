package com.company;

class MyMainEmpolyee {
    private int id;
    private String name;

    public MyMainEmpolyee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmpolyee() {
        id = 45;
        name = "Your name is ";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

//Quiz
class Employee {
    // First constructor
    Employee(String s, int i) {
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }

    // Constructor overloaded
    Employee(String s, int i, int salary) {
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }
}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmpolyee Mayuresh = new MyMainEmpolyee("Programme Learning", 654);
        //MyMainEmpolyee Mayuresh = new MyMainEmpolyee();
        /*Mayuresh.setName("Mayuresh is here ");
        Mayuresh.setId(35);*/
        System.out.println(Mayuresh.getName());
        System.out.println(Mayuresh.getId());
        //Quiz
        Employee shubham = new Employee("Shubham", 1);
        Employee harry = new Employee("Harry", 2, 10000);

    }
}
