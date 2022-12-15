package com.pragra.day10;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {

        System.out.println("*********************");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        String choice;
        do {

            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            System.out.println("Enter First number");
            int firstNum = sc.nextInt();

            System.out.println("Enter Second number");
            int secondNum = sc.nextInt();

            switch (input) {
                case 1:
                    sum(firstNum, secondNum);
                    break;
                case 2:
                    diff(firstNum, secondNum);
                    break;
                case 3:
                    multiply(firstNum, secondNum);
                    break;
                case 4:
                    division(firstNum, secondNum);
                    break;
                default:
                    System.out.println("you entered a wrong number");

            }
            System.out.println("Do you want to continue???? if yes press y, if not press n");
             choice = sc.next();
            if (choice.equals("y")) {
                continue;
            } else {
                break;
            }
        } while (choice.equals("y"));

    }

        public static void sum(int a, int b) {

        System.out.println("The addition is" +(a + b));
    }

    public static void diff(int a, int b) {

        System.out.println("The subtraction is " +(a - b));
    }

    public static void multiply(int a, int b) {

        System.out.println("The multiplication is "+(a * b));
    }

    public static void division(int a, int b) {

        System.out.println("The division is " +(a / b));
    }
}
