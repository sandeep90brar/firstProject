//To find greatest number in an array
package com.pragra.day8;

public class ArrayGreatestNumber {
    public static void main(String[] args) {
        int marks[]={12,34,56,43,91};
        greatestNumber(marks);
    }
    public static void greatestNumber(int marks[]){
        int myAssumedHighestMarks=marks[0];
        for(int i=0;i<marks.length;i++){
            if (myAssumedHighestMarks<marks[i]){
                myAssumedHighestMarks=marks[i];
            }
        }
        System.out.println("Greatest number among all numbers is "+myAssumedHighestMarks);
    }
}
