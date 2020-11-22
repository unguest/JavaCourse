package com.unguest.EqualSumChecker;

public class Main {

    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1)); // Should be false
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2)); // Should be true
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0)); // should be true
    }
}
