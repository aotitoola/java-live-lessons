package com.learn.classesAndObjects;

public class Time1Test {
    public static void main(String[] args) {

        // create and initialize a Time1 object
        Time1 time = new Time1();   // invokes Time1 constructor

        // output string representations of the time
        displayTime("After time object is created", time);
        System.out.println();

        // change time and output updated time
        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        // attempt to set time with invalid values
        try {
            time.setTime(99, 99, 99); // all values out of range
        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        // displays a Time1 object in 24-hour and 12-hour formats
        displayTime("After calling setTime with invalid values", time);


    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
} // end class Time1Test
