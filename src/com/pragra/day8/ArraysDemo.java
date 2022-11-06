package com.pragra.day8;

import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 99;
        marks[2] = 89;
        marks[3]=87;
        marks[4]=88;
        int sum=0;
        for(int i=0;i< marks.length;i++){
        System.out.println("Marks in Subject no "+i+"  are : "+marks[i]);
        sum=sum+marks[i];
        }
        System.out.println("Total marks scored are " +sum);
}}
