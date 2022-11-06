package com.pragra.day8;

import java.util.Random;

public class ArrayAssignment {
    public static void main(String[] args) {
        double arr[] = new double[10];

        sumOfDecimalNumbers(arr);
    }
        public static void sumOfDecimalNumbers(double[] arr){
            Random r = new Random();
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(10);
                System.out.println(arr[i]);
                sum = sum + arr[i];
            }
            System.out.println("Sum of all decimal numbers is "+sum);

        }


    }

