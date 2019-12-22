package com.sethjava.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,  "A");
        linkedHashMap.put(2,  "B");
        linkedHashMap.put(3,  "C");
        linkedHashMap.put(4,  "D");

        linkedHashMap.forEach((key, value) -> {
            System.out.println("Key:"+ key + ", Value:" + value);
        });

        // Access ordered map
        LinkedHashMap<Integer, String> pairs = new LinkedHashMap<>(2, .75f, true);
        pairs.putAll(linkedHashMap);
        //Access 3rd pair
        pairs.get(3);
        //Access 1st pair
        pairs.getOrDefault(2, "oops");
        pairs.forEach((key, value) -> {
            System.out.println("Key:"+ key + ", Value:" + value);
        });

        String value = linkedHashMap.getOrDefault(5, "oops");  //getOrDefault method
        System.out.println(value);

        //Iteration example
        Iterator<Integer> iterator =  linkedHashMap.keySet().iterator();
        while(iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + pairs.get(key));
        }

        //Remove example
        linkedHashMap.remove(3);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.containsKey(1));    //containsKey method
        System.out.println(linkedHashMap.containsValue("B"));    //containsValue method
    }
}
