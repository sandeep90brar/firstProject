package com.pragra.day5;

public class MathOperations {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " +a + " is  " + fact);

        return fact;
    }
    public static int fibonacci(int a){
    int x=0;
    int y=1;
        System.out.println("Fibonacci Series till " + a + " is:");

        for (int i = 1; i <=a; i++) {
            System.out.print(x + " , ");

            // compute the next term
            int next = x + y;
            x = y;
            y = next;
        }
        return a;
    }

    public static void main(String[] args) {
        factorial(5);
        fibonacci(10);
    }}

