package com.pragra.day9;

public class StringsDemo {
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "Welcome";
        String str3=new String("Welcome");

        if (str1 == str3) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
