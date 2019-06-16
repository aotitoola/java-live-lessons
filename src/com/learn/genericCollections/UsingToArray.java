package com.learn.genericCollections;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {

    // creates a LinkedList, adds element and converts to array
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        // read-only collection, a view into the array

        links.addLast("red"); // add as last item
        links.add("pink"); // add to the end
        links.add(3,"green"); // add at 3rd index
        links.addFirst("cyan"); // add as first item

        // get LinkedList elements as an array
//        colors = links.toArray(new String[links.size()]);
        colors = links.toArray(new String[0]);

        System.out.println("Colors: ");

        for (String color : colors)
            System.out.printf("%s ", color);
    }


}
