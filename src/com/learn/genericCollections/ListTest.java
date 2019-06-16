package com.learn.genericCollections;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        // add colors elements to list1
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color : colors)
            list1.add(color);

        // add colors2 elements to list2
        String[] colors2 = {"gold","white","brown","blue","gray","silver"};
        List<String> list2 = new LinkedList<>();

        Collections.addAll(list2, colors);

        list1.addAll(list2); // concatenate lists
        list2 = null; // release resources
        printList(list1); // print list1 elements

        convertToUpperCaseStrings(list1); // convert to uppercase string
        printList(list1);

        System.out.printf("%n Deleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove items 4 to 6 from list
        printList(list1); // print list1 elements
        printReversedList(list1); // print list in reverse order

    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");
        while (listIterator.hasPrevious())
            System.out.printf("%s ", listIterator.previous());
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printList(List<String> list) {

        System.out.printf("%nList:%n");
        for (String color: list)
            System.out.printf("%s ", color);
    }

    private static void convertToUpperCaseStrings(List<String> list) {

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // convert to uppercase
        }
    }

    private static void removeColors(List<String> list1, List<String> list2){

        Iterator<String> iterator = list1.iterator();

        while (iterator.hasNext()){
            if (list2.contains(iterator.hasNext()))
                iterator.remove();
        }
    }
}
