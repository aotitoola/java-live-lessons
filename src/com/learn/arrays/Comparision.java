package com.learn.arrays;

import java.util.Scanner;

public class Comparision {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter Second Integer: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
            System.out.println("This worked.");

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        input.close();
    }
}
