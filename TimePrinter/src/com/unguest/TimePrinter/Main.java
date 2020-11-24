package com.unguest.TimePrinter;

public class Main {

    public static void main(String[] args) {
	String test1 = TimePrinter.getDurationString(920, 39);
    String test2 = TimePrinter.getDurationString(55239); // Overloaded function to work with seconds
    String test3 = TimePrinter.getDurationString(-1);

    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    }
}
