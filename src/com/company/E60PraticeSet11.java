package com.company;

abstract class Pen {

    abstract void write();

    abstract void refill();

}

class fountainPen extends Pen {
    void write() {
        System.out.println("Write in fountain pen ");
    }

    void refill() {
        System.out.println("refill in fountain pen");
    }

    void changeNim() {
        System.out.println("changing the nim");
    }
}

class Monkey {
    void jump() {
        System.out.println("Monkey Jumping...");
    }

    void bite() {
        System.out.println("Monkey Biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello i am Human");
    }

    @Override
    public void eat() {
        System.out.println("Eating interface");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping interface");
    }
}

        //q4
abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    void ring() {
        System.out.println("SmartTelephone is ringing.");
    }

    @Override
    void lift() {
        System.out.println("SmartTelephone is lifted.");
    }

    @Override
    void disconnect() {
        System.out.println("SmartTelephone is disconnected.");
    }
}

        //q6
interface TVRemote {
    void powerOn();

    void powerOff();

    void channelUp();

    void channelDown();
}

interface SmartTVRemote extends TVRemote {
    void openNetflix();

    void openYouTube();
}

class SamsungSmartTV implements SmartTVRemote {
    private boolean isOn;
    private int currentChannel;

    public void powerOn() {
        isOn = true;
        System.out.println("Samsung Smart TV is turned on.");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Samsung Smart TV is turned off.");
    }

    public void channelUp() {
        currentChannel++;
        System.out.println("Samsung Smart TV channel is increased to " + currentChannel);
    }

    public void channelDown() {
        currentChannel--;
        System.out.println("Samsung Smart TV channel is decreased to " + currentChannel);
    }

    public void openNetflix() {
        System.out.println("Netflix is opened on Samsung Smart TV.");
    }

    public void openYouTube() {
        System.out.println("YouTube is opened on Samsung Smart TV.");
    }
}

        //q7
class TV implements TVRemote {
    private boolean isOn;
    private int currentChannel;

    public void powerOn() {
        isOn = true;
        System.out.println("TV is turned on.");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("TV is turned off.");
    }

    public void channelUp() {
        currentChannel++;
        System.out.println("TV channel is increased to " + currentChannel);
    }

    public void channelDown() {
        currentChannel--;
        System.out.println("TV channel is decreased to " + currentChannel);
    }
}

public class E60PraticeSet11 {
    public static void main(String[] args) {
        //q1 and q2
        fountainPen fpen = new fountainPen();
        fpen.changeNim();
        //q3
        Human H = new Human();
        H.eat();
        H.sleep();
        H.speak();
        H.bite();
        //q4
        // Create a Telephone object and call its methods
        Telephone telephone = new SmartTelephone();
        telephone.ring();
        telephone.lift();
        telephone.disconnect();
        //q5
        Monkey m = new Human();
        m.jump();
        m.bite();
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();
        //q6
        SamsungSmartTV tv = new SamsungSmartTV();
        tv.powerOn();
        tv.channelUp();
        tv.openNetflix();
        tv.channelDown();
        tv.powerOff();
        //q7
        TV tav;
        tav = new TV();
        tav.powerOn();
        tav.channelUp();
        tav.channelDown();
        tav.powerOff();
    }
}
