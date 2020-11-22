package com.unguest.SpeedConverter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (!(kilometersPerHour < 0)) {
            return Math.round(kilometersPerHour / 1.609);
        } else return -1; // Error case
    } // toMilesPerHour()

    public static long toKilometersPerHour(double milesPerHour) {
        if(!(milesPerHour < 0)) {
            return Math.round(milesPerHour * 1.609);
        } else return -1;
    } // toKilometersPerHour()

    public static void printConversionMTK(double milesPerHour) {
        long kilometersPerHour = toKilometersPerHour(milesPerHour);

        if(!(kilometersPerHour <0)) {
            System.out.println(milesPerHour + " mi/h = " + kilometersPerHour + " km/h");
        } else {
            System.out.println("Invalid Value.");
        }
    } // printConversionMTK()

    public static void printConversionKTM(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (!(milesPerHour < 0)) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " ki/h");
        } else {
            System.out.println("Invalid Value.");
        }
    } // printConversionKTM()

    public static void printConversion(double kilometersPerHour) { // Made to satisfy Udemy Validator
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (!(milesPerHour < 0)) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " ki/h");
        } else {
            System.out.println("Invalid Value.");
        }
    } // printConversion()


} // SpeedConverter Class
