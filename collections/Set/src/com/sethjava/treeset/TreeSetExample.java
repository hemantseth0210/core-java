package com.sethjava.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);

        // Creating a TreeSet with a custom Comparator (Case Insensitive Order)
        SortedSet<String> fruitsCaseInsensitive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        fruitsCaseInsensitive.addAll(fruits);
        System.out.println("Fruits Case Insensitive Set : " + fruitsCaseInsensitive);

        // Creating a TreeSet with a custom Comparator (Descending  Order)
        SortedSet<String> fruitsReverse = new TreeSet<>(Comparator.reverseOrder());
        fruitsReverse.addAll(fruitsCaseInsensitive);
        System.out.println("Fruits Reverse Set : " + fruitsReverse);

        // Finding the size of a TreeSet
        System.out.println("Number of elements in the TreeSet : " + fruits.size());

        // Check if an element exists in the TreeSet
        String name = "Orange";
        if(fruits.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        } else {
            System.out.println("TreeSet does not contain the element : " + name);
        }

        // Navigating through the TreeSet
        System.out.println("First element : " + fruits.first());
        System.out.println("Last element : " + fruits.last());

        name = "Orange";
        System.out.println("Element just greater than "  + name + " : " + fruits.higher(name));
        System.out.println("Element just lower than "  + name + " : " + fruits.lower(name));

        // Remove an element from the TreeSet
        System.out.println("Orange removed from tree set : " + fruits.remove("Orange"));

        // Retrieve and remove the first element from the TreeSet
        String fruit = fruits.pollFirst();
        System.out.println("Removed first element " + fruit + " from the TreeSet : " + fruits);

        // Retrieve and remove the last element from the TreeSet
        fruit = fruits.pollLast();
        System.out.println("Removed last element " + fruit + " from the TreeSet : " + fruits);

    }
}
