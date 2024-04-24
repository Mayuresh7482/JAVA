package com.company;

import java.util.Random;
import java.util.Scanner;

 class E43Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        System.out.println("I'm thinking of a number between 1 and 100. Guess what it is!");

        int guess = 0;
        int numGuesses = 0;

        while (guess != number) {
            guess = input.nextInt();
            numGuesses++;

            if (guess < number) {
                System.out.println("Too low! Guess again.");
            } else if (guess > number) {
                System.out.println("Too high! Guess again.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
    }
}
