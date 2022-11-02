package com.pragra.day6;

import java.util.Scanner;

public class MathRandom {
    public static void main(String[] args) {
        //1st way
        int thoughtNumber = (int) (Math.random()*10);
        System.out.println("let's play a guessing game");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        while(true){
            int enteredNumber = sc.nextInt();
            if(enteredNumber==thoughtNumber){
                System.out.println("You entered a correct number... YOU WON!!!!");
                break;
            }
            else{
                System.out.println("You entered a wrong number... TRY AGAIN!!");
            }

        }
        //2nd way


    }
}
