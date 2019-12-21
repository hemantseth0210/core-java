package com.sethjava.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        //1. Create LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        //2. Add elements to LinkedHashSet
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("E");

        System.out.println(linkedHashSet);

        //3. Check if element exists
        boolean found = linkedHashSet.contains("A");  //true
        System.out.println(found);

        //4. Remove an element
        linkedHashSet.remove("D");

        //5. Iterate over values
        Iterator<String> itr = linkedHashSet.iterator();
        while(itr.hasNext())
        {
            String value = itr.next();
            System.out.println("Value: " + value);
        }
    }
}
