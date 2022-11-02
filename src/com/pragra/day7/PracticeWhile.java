package com.pragra.day7;

public class PracticeWhile {
    public static void main(String[] args) {
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
        }
            System.out.println();
    }*/

        int i=1;
        while(i<=5){
            int j=1;
            while(j<=i){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }

}}
