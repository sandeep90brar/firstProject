package com.pragra.day8;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks scored in 5 subjects");

        int arr[] = new int[5];
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

    }System.out.println("Total is " + sum);
}}
