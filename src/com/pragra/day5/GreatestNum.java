package com.pragra.day5;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        //greatestOf3(9, 9, 4);

        Scanner sc= new Scanner(System.in);
        int capturedInteger = sc.nextInt();
        System.out.println("enter the numbers");


    }

    public static void greatestOf3(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("greatest number is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("greatest number is " + b);
        } else {
            System.out.println("greatest number is " + c);
        }
    }
}
