package com.learn.genericCollections;

import java.util.*;

public class WordTypeCount {

    public static void main(String[] args) {
        // create HashMap to store String Keys and Integr values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    } // end main

    // create map from user input
    private static void createMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string: "); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        String tokens[] = input.split("");

        // processing input text
        for (String token : tokens) {
            String word = token.toLowerCase(); // get lowercase word

            // if the map contains the word
            if (map.containsKey(word)) // is word in map?
            {
                int count = map.get(word); // get current count
                map.put(word, count + 1);
            } else {
                map.put(word, 1); // add new word with a count of 1 to map
            }
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map){
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains: %nKey\t\tValue%n");
        for (String key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
