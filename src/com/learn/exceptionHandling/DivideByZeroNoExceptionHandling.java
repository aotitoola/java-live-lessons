package com.learn.exceptionHandling;

public class DivideByZeroNoExceptionHandling {

    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator)
    {
        return numerator / denominator; // possible division by zero
    }
}
