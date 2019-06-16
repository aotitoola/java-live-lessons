package com.learn.arrays;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of Integer 7 is %d%n", square(7));
        System.out.printf("Square of Double 7.5 is %f%n", square(7.5));
    }

    private static int square(int intValue) {
        System.out.printf("Called square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    private static double square(double doubleValue) {
        System.out.printf("Called square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
