package com.learn.arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution: ");

        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");

                System.out.println();
            }

        }

//        final int ARRAY_LENGTH = 100; //CONSTANT

//        int[] array = new int[ARRAY_LENGTH];
//        String[] array = new String[10];
//        int[] array = {23, 44, 55, 65, 32, 12, 34, 26, 89, 200};
//        int total = IntStream.of(array).sum();
//        System.out.println(total);



//


//        System.out.printf("%s%8s%n", "Index", "Value");
//
//        int total = 0;
////        for (int j : array)
////            total += j;
//
//        for (int counter = 0; counter < array.length; counter++)
//            total += array[counter];
////            System.out.printf("%5d%8d%n", i, array[i]);
//        System.out.println(total);



    }
}
