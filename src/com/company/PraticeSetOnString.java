package com.company;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class PraticeSetOnString {
    public static void main(String[] args) {
        //q1
        String name  = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);
        //q2
        System.out.println(name.replace(" ","_"));
        //q3
        String letter = "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>","Mayuresh");
        System.out.println(letter);
        //q4
        String myString = "this is String contains  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        //q5
        String letter1 = "Dear Mayuresh,\n \tThis java Course is helpful.\n\t\tThanks";
        System.out.println(letter1);
    }
}
