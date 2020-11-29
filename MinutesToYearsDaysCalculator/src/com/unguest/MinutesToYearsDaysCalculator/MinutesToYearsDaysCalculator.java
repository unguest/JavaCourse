package com.unguest.MinutesToYearsDaysCalculator;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {

        if(minutes >= 0) {
            long days = minutes / (24 * 60);
            long years = days / 365;
            days -= years * 365;

            System.out.println(minutes + " min = " + years + " y and " + days+ " d");
        } else System.out.println("Invalid Value");

    }
}
