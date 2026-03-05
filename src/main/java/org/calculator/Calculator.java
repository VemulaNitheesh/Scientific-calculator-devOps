package org.calculator;

public class Calculator {

    public double squareRoot(double a){
        return Math.sqrt(a);
    }
    public long factorial(int n){

        long result = 1;

        for(int i = 1; i <= n; i++){
            result = result * i;
        }

        return result;
    }
    public long power(int base, int exponent){
        return (long) Math.pow(base, exponent);
    }

    public double naturalLog(double x){
        return Math.log(x);
    }
}