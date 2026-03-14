package org.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Scientific Calculator");

        while(true){

            System.out.println("Choose operation:");
            System.out.println("1 . Square Root");
            System.out.println("2 . Factorial of x");
            System.out.println("3 . find x power y");
            System.out.println("4 . Find log(x)");
            System.out.println("5 . Exit");

            int choice = sc.nextInt();

            if(choice == 1){

                System.out.println("Enter number:");
                double num = sc.nextDouble();

                double result = calc.squareRoot(num);

                System.out.println("Result = " + result);
            } else if (choice == 2) {

                System.out.println("Enter x:");
                int num = sc.nextInt();

                long result = calc.factorial(num);

                System.out.println("Factorial is " + result);


            } else if(choice == 3){

                System.out.println("Enter base:");
                double x = sc.nextInt();
                System.out.println("Enter exponent:");
                double y = sc.nextInt();

                double result = calc.power(x,y);
                System.out.println("Result = "+result);


            }
            else if(choice == 4){

                System.out.println("Enter number :");
                double num = sc.nextDouble();
                double result = calc.naturalLog(num);
                System.out.println("Result :" +result);

            }
            else if(choice == 5){
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
