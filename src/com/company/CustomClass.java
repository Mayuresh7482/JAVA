package com.company;
class Empolyee{
    public int salary1;
    int id;
    String name;
    int salary;
    public void printDetailes(){
        System.out.println("My Id is " + id);
        System.out.println("and name is " + name);
        System.out.println("and Salary is " + salary);
    }


}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Empolyee Mayur = new Empolyee();
        Empolyee John = new Empolyee();
        //Setting attributes
        Mayur.id = 1224;
        Mayur.name = "Mayuresh";
        Mayur.salary = 324560;
        John.id = 1332;
        John.name = "John";
        John.salary = 15000;
        //System.out.println(Mayur.id);
        //System.out.println(Mayur.name);
        Mayur.printDetailes();
        John.printDetailes();
    }
}
