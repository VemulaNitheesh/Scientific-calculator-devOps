package org.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Calculator");

        while (true) {

            System.out.println("Choose operation:");
            System.out.println("1 → Addition");
            System.out.println("2 → Subtraction");
            System.out.println("3 → Exit");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.println("Enter first number:");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid first number.");
                sc.next();
                continue;
            }

            double a = sc.nextDouble();

            System.out.println("Enter second number:");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid second number.");
                sc.next();
                continue;
            }

            double b = sc.nextDouble();

            double result;

            if (choice == 1) {
                result = calc.add(a, b);
            } else if (choice == 2) {
                result = calc.subtract(a, b);
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}