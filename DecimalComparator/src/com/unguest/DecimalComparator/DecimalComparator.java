package com.unguest.DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberA, double numberB) {

        return (int) (numberA * 1000) == (int) (numberB * 1000);

    }// areEqualByThreeDecimalPlaces()

} // DecimalComparator Class
