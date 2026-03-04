package org.calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Calculator");

        System.out.println("Choose operation:");
        System.out.println("1 → Addition");
        System.out.println("2 → Subtraction");

        int choice = sc.nextInt();

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        double result;

        if(choice == 1) {
            result = calc.add(a, b);
        }
        else if(choice == 2) {
            result = calc.subtract(a, b);
        }
        else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        System.out.println("Result = " + result);



        sc.close();
    }
}