package com.sethjava.treemap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Natural ordering based on key
        Map<Integer,String> map = new TreeMap<>();
        map.put(10, "David");
        map.put(1, "Greg");
        map.put(5, "Kelly");
        System.out.println(map);

        map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return (x > y) ? -1 : ((x == y) ? 0 : 1);
            }
        });
        map.put(10, "David");
        map.put(1, "Greg");
        map.put(5, "Kelly");
        System.out.println(map);

        map = new TreeMap<>(Collections.reverseOrder());
        map.put(10, "David");
        map.put(1, "Greg");
        map.put(5, "Kelly");
        System.out.println(map);
    }
}
