package com.company;
import java.util.Scanner;

public class MessageDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        System.out.println("Your message is: " + message);
    }
}
