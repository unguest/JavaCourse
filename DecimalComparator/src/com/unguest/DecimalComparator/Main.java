package com.unguest.DecimalComparator;

public class Main {

    public static void main(String[] args) {
        boolean A = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0); // Should return true
        boolean B = DecimalComparator.areEqualByThreeDecimalPlaces(3.0000, 3.0001); // Should return true
        boolean C = DecimalComparator.areEqualByThreeDecimalPlaces(3.000, 3.001); // Should return false

        System.out.println(A + " " + B + " " + C);
    }
}
