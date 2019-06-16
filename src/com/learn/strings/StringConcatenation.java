package com.learn.strings;

public class StringConcatenation {

    public static void main(String[] args) {
        String s1 = "Happy ";
        String s2 = "Birthday";
        String s3;

        System.out.printf("s1 = %s%ns2 = %s%n%n", s1, s2);
        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));

        s3 = s1.concat(s2);

        // to prove s1 was not modified; Strings are immutable
        System.out.printf("s1 after concatenation = %s%n", s1);

        System.out.printf("s3 is %s%n", s3);
    }
}
