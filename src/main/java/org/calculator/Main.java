package org.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Calculator");

        while (true) {

            int choice = -1;

            System.out.println("Choose operation:");
            System.out.println("1 → Addition");
            System.out.println("2 → Subtraction");
            System.out.println("3 → Exit");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input. Try again.");
                sc.next();
                continue;
            }

            if (choice == 3) {
                System.out.println("Exiting calculator...");
                break;
            }

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.println("Enter first number:");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid number.");
                sc.next();
                continue;
            }

            double a = sc.nextDouble();

            System.out.println("Enter second number:");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid number.");
                sc.next();
                continue;
            }

            double b = sc.nextDouble();

            double result;

            if (choice == 1) {
                result = calc.add(a, b);
            } else {
                result = calc.subtract(a, b);
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}