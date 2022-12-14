package com.pragra.day9;

import java.util.Scanner;

public class Person {
    String name;
    double gpa;
    public Person(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
        toString();
        getName();
        setGpa();

    }
    public void getName(){
        System.out.println("Name is "+name);

    }
    public void setGpa(){
        System.out.println("GPA: "+gpa);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
