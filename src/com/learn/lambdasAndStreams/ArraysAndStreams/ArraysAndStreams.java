package com.learn.lambdasAndStreams.ArraysAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {

    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        // display original values
        System.out.printf("Original Values: %s%n", Arrays.asList(values));

        // sort values in ascending order with streams
        System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
                        .sorted()
                        .collect(Collectors.toList()));

        // values greater than 4
        List<Integer> greaterThan4 =
                Arrays.stream(values)
                        .filter(value -> value > 4)
                        .collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);

        // filter values greater than 4 then sort the results
        // Arrays.streams creates stream of objects (long, float, integer, etc.)
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(values)
                        .filter(value -> value > 4)
                        .sorted()
                        .collect(Collectors.toList()));

        // collect is used in a situation where we want to use the outputs later on

        // greaterThan4 List sorted with streams
        System.out.printf("Values greater than 4 (ascending with streams): %s%n",
                greaterThan4.stream()
                        .sorted()
                        .collect(Collectors.toList()));

    }
}
