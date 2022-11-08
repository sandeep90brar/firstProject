package com.pragra;

public class Calculator {
    public static void main(String[] args) {
        sout("Program to perform calculator operations");
       int sumResult = sum(3, 7);
        System.out.println("The sum of a and b is :" + sumResult);

        int diffResult = diff(10, 5);
        System.out.println("The diff of a and b is :" + diffResult);

        int mulResult = multiply(10, 5);
        System.out.println("The multiplication of a and b is :" + mulResult);

        int divResult = division(10, 5);
        System.out.println("The division of a and b is :" + divResult);
    }

    public static int sum(int a, int b) {

        return a+b;
    }
    public static int diff(int a, int b) {

        return a - b;
    }
    public static int multiply(int a, int b) {

        return a * b;
    }
    public static int division(int a, int b) {

        return a / b;
    }
    public static void GreatestOfNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Largest Number is " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest Number is " + b);
        } else {
            System.out.println("Largest Number is " + c);
        }
    }
    }

