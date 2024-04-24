package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 0 for Rock, 1 for Paper, 2 for Scissors
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter 0 for Rock, 1 for Paper, or 2 for Scissors: ");

        int userChoice = sc.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice! Please enter a number between 0 and 2.");
            return;
        }

        int computerChoice = random.nextInt(3);

        System.out.println("You chose " + choices[userChoice]);
        System.out.println("The computer chose " + choices[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2)
                || (userChoice == 1 && computerChoice == 0)
                || (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }
    }
}
