package com.sethjava.hashmap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "John"); // put example
        map.put("2", "Kelly");
        map.put("3", "Greg");
        map.put("4", null); // null value
        map.put(null, "David"); // null key

        // get example
        String value = map.get("3");
        System.out.println("Key = 3, Value = " + value);

        //GetorDefault example
        value = map.getOrDefault("5", "Default Value");
        System.out.println("Key = 5, Value=" + value);

        System.out.println("Map contains null key = "+ map.containsKey(null));
        System.out.println("Map contains Kelly value = "+ map.containsValue("Kelly"));

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        //iterate
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            if(next.getKey() == null) {
                iterator.remove();
            }
            System.out.println("Key = "+ next.getKey() +" Value = "+ next.getValue());
        }

        System.out.println("================");

        // iterate
        for(Map.Entry<String, String> entry: entrySet){
            System.out.println("Key = "+ entry.getKey() +" Value = "+ entry.getValue());
        }

        Set<String> keySet = map.keySet();
        System.out.println("map keys = " + keySet);

        Collection<String> values = map.values();
        System.out.println("map values = " + values);

        // Remove example
        String nullKeyValue = map.remove(null);
        System.out.println("map null key value = " + nullKeyValue);
        System.out.println("map1 after removing null key = " + map);

        // Remove
        values.remove("Greg"); // changing values collection
        System.out.println(map); // updates in map too

        //putifabsent example
        map.putIfAbsent("5", "Charlie");
        System.out.println(map);

        // TO DO - compute and computeifabsent
    }
}
