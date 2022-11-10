package com.pragra.day9;

public class PalindromeString {
    public static void main(String[] args) {
        checkStringPalindrome("welcome");

    }
    public static void checkStringPalindrome(String str){
        char ch;
        String revString="";
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            revString = ch + revString;
        }
            if(str.equals(revString)){
                System.out.println("String "+str+" is a Palindrome");
            }
            else{
                System.out.println("String "+str+" is not a Palindrome");
            }


        }
    }

