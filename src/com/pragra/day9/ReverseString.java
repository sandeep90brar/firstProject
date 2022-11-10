package com.pragra.day9;

public class ReverseString {
    public static void main(String[] args) {
        String str;
        reverseGivenString("Welcome");
    }

    public static void reverseGivenString(String str) {
        String revStr="";
        char ch;
        for (int i=0; i<str.length(); i++) {
            ch=str.charAt(i);
            revStr=ch+revStr;
        }
        System.out.println("reverse of string "+str+ " is "+revStr);
    }
}
