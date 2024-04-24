package com.company;

interface MyCamera1 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning ");
    }

    default void recordingIn4k() {
        greet();
        System.out.println("Recording in 4k ... ");
    }
}

interface MyWifi1 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellphone1 {
    void cellNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall1() {
        System.out.println("Connecting.. ");
    }

}

class MySmartphone1 extends MyCellphone1 implements MyWifi1, MyCamera1 {
    public void takeSnap() {
        System.out.println("Taking Snap.. ");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking videoRecording.. ");
    }

    /*public void recordingIn4k() {
        System.out.println("Record in 4k..");
    }*/

    @Override
    public String[] getNetwork() {
        System.out.println("Getting List of Network ");
        String[] networklist = {"Mayur", "Shubh", "Anjali "};
        return networklist;

    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}
public class E59Polymorphism {
    public static void main(String[] args) {
MyCamera1 cam1 = new MySmartphone1();
        cam1.recordingIn4k();
        MySmartphone1 s = new MySmartphone1();
        s.recordVideo();
        s.getNetwork();
        s.cellNumber(789456321);
    }
}
