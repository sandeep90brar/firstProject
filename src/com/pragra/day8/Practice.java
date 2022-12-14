package com.pragra.day8;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String s="abcd";
        String s1="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            s1=c+s1;

        }
        System.out.println(s1);



       int sum=0;
        int arr[] = new int[5];
        Scanner sc=new Scanner(System.in);
        int i1 = sc.nextInt();

        for (int i = 0; i< arr.length;i++){
            sum=sum+arr[i];

        }
       // System.out.println(sum);

    }
}