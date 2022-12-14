package com.pragra.day9;

import java.sql.SQLOutput;

public class Circle {
     int radius;

    public Circle(int radius) {
        this.radius = radius;
        System.out.println(areaOfCircle());
    }

    public  double areaOfCircle(){

        return 3.14*radius*radius;
    }

}
