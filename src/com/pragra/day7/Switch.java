package com.pragra.day7;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number!!!");
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
