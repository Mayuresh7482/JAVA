package com.company;

interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void recordingIn4k() {
        greet();
        System.out.println("Recording in 4k ...");
    }
}

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellphone {
    void cellNumber(int phoneNumber) {
        System.out.println("Calling" + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting.. ");
    }

}

class MySmartphone extends MyCellphone implements MyWifi, MyCamera {
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
        System.out.println("Getting List of Network");
        String[] networklist = {"Mayur", "Shubh", "Anjali"};
        return networklist;

    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class E52DefaultMethods {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        ms.recordingIn4k();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
