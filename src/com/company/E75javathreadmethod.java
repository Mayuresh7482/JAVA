package com.company;
class MyNewthr1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 12) {
            System.out.println("i m thread" + this.getName());
            i++;
        }
    }
}
class MyNewthr2 extends Thread {


    public void run() {
        int i = 0;
        while (true) {
            System.out.println("i m thread" + this.getName());
            try {
                Thread.sleep(455);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class E75javathreadmethod {
    public static void main(String[] args) {
MyNewthr1 t1 = new MyNewthr1();
MyNewthr2 t2 = new MyNewthr2();
t1.start();
/*try{
    t1.join();
}
catch (Exception e){
    System.out.println(e);
}*/

t2.start();
    }
}
