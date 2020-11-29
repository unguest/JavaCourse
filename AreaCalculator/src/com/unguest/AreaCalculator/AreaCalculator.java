package com.unguest.AreaCalculator;

public class AreaCalculator {
    public static double area(double radius) {
        if( radius >= 0 )
            return Math.PI * Math.pow(radius, 2);
        else
            return -1.0;
    }

    public static double area(double sideA, double sideB) {
        if (sideA >= 0 && sideB >= 0) {
            return sideA * sideB;
        } else
            return -1.0;
    }
}
