package com.learn.arrays;

public class PassArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        //Always remember, strings are immutable
        System.out.printf("Effects of passing reference to  entire array: %n" +
                "The Values of the original array are: %n");

        //output original array elements
        for (int value: array) {
            System.out.printf("   %d", value);
        }

        modifyArray(array);
        System.out.printf("%n%nThe Values of the modified array are: %n");

        for (int value : array)
            System.out.printf("   %d", value);

        System.out.printf("%n%nEffects of passing array element value:%n" +
                "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]); //attempt to modify array[3]

        System.out.printf("array[3] after modifyElement: %d%n", array[3]);


    }

    public static void modifyArray(int[] array2) {
//        for (int val : array2) {
//                  val *= 2;
//        }
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }

}
