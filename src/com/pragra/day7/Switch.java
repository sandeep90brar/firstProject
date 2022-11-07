package com.pragra.day7;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print days in each month");
        System.out.println("Enter the month number!!!");
        System.out.println("This Program will let u know the days in each month");
        int monthNo = sc.nextInt();

        switch (monthNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month contains 31 days");
                break;

            case 2:
                System.out.println("This month has 28/29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("This month has 31 days");

                break;

        }

    }
}
