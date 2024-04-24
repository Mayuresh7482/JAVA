package com.company;
    //Problem no.1
class Empolyee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
      return name;
    }
    public void setName(String n){
      name = n;
    }
}
    //Problem no.2
class CellPhone {
    public void ringing() {
        System.out.println("Ringing...");
    }
    public void Vibrating() {
        System.out.println("Vibrating...");
    }
    public void CallFriends() {
        System.out.println("CallFriends...");
    }
    }
//Problem no.3
class Square{
    int side;
    public  int area(){
        return side*side;
    }
    public int perimeter(){

        return 4*side;
    }
}
        //problem 4
        class Rectangle {
             double length;
             double width;

            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }
            public double perimeter(){
                //P=2(l+w)
                return (double) (2*(length+width));
            }

            public double getArea() {
                return length * width;
            }


        }
            //Problem 5
        class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from enemy");
    }
    public void fire(){
        System.out.println("Firing on enemy");
    }
            }


public class PS08 {
    public static void main(String[] args) {
        //Problem no.1

        /*Empolyee1 Mayur1 = new Empolyee1();
        Mayur1.setName("Mayuresh");
        Mayur1.salary = 233;
        System.out.println(Mayur1.getSalary());;
        System.out.println(Mayur1.getName());;

        //Problem no.2

        CellPhone vivo = new CellPhone();
        vivo.CallFriends();
        vivo.Vibrating();
        vivo.ringing();

        //Problem no.3

        Square sq =new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/

        //Problem 4

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        double area = rectangle.getArea();
        double perimeter = rectangle.perimeter();
        System.out.println("Area of rectangle: " + area);
        System.out.println("Area of perimeter: " + perimeter);

        //Problem 5

        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
