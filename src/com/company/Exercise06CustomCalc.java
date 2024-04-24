package com.company;

import java.util.Scanner;

public class Exercise06CustomCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            if (num1 > 100000) {
                throw new MaxInputException("Number exceeds max input limit of 100000");
            }

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            if (num2 > 100000) {
                throw new MaxInputException("Number exceeds max input limit of 100000");
            }

            switch (operator) {
                case "+":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "*":
                    if (num1 > 7000 || num2 > 7000) {
                        throw new MaxMultiplierReachedException("Number exceeds max multiplier limit of 7000");
                    }
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new CannotDivideByZeroException("Cannot divide by zero");
                    }
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default:
                    throw new InvalidInputException("Invalid operator input");
            }

        } catch (InvalidInputException | CannotDivideByZeroException | MaxInputException | MaxMultiplierReachedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}
