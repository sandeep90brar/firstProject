package com.pragra.day5;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number to be added");
        x = scan.nextInt();
        System.out.println("Enter the second number to be added");
        y = scan.nextInt();

        sum(x,y);

    }
    private static void sum(int x,int y) {
        int answer = x+y;

        System.out.println(answer);

    }
}
