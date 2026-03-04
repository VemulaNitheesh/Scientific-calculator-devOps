package org.calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Addition Calculator");

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        double result = calc.add(a,b);

        System.out.println("Result = " + result);

        sc.close();
    }
}