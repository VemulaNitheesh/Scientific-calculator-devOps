package org.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Scientific Calculator");

        while(true){

            System.out.println("Choose operation:");
            System.out.println("1 → Square Root");
            System.out.println("2 → Exit");

            int choice = sc.nextInt();

            if(choice == 1){

                System.out.println("Enter number:");
                double num = sc.nextDouble();

                double result = calc.squareRoot(num);

                System.out.println("Result = " + result);
            }
            else if(choice == 2){

                System.out.println("Exiting calculator...");
                break;
            }
            else{

                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}