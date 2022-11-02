package com.pragra.day5;

import java.util.Scanner;

public class ScannerExample {
    static int x;
    public static void main(String[] args) {
        System.out.println("This example shows the use of scanner");
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        OddEven(x);

    }
    public static int OddEven(int x){
     if(x%2==0){
         System.out.println(x + "is an even number");
     }
     else{
         System.out.println(x + "is an odd number");
     }
     return(x);
    }
}
