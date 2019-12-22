package com.sethjava.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigationExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(10, "David");
        map.put(1, "Greg");
        map.put(5, "Kelly");
        map.put(2, "Nancy");
        map.put(3, "Albert");
        map.put(4, "Richard");
        map.put(6, "Carl");
        map.put(7, "Timothy");
        map.put(8, "Scarlett");
        map.put(9, "Eric");
        System.out.println(map);

        //lowerEntry
        Map.Entry<Integer, String> entry = map.lowerEntry(5);
        System.out.println("Closest Lower key than 5 is "+entry);
        //higherEntry
        entry = map.higherEntry(5);
        System.out.println("Closest Higher key than 5 is "+entry);

        //floorEntry
        entry = map.floorEntry(5);
        System.out.println("Closest floor entry than 5 is "+entry);

        //ceilingEntry
        entry = map.ceilingEntry(4);
        System.out.println("Closest ceiling key than 4 is "+entry);

        //firstEntry
        entry = map.firstEntry();
        System.out.println("First Entry is "+entry);

        //lastEntry
        entry = map.lastEntry();
        System.out.println("Last Entry is "+entry);

        // Reverse the map
        Map<Integer, String> reversedMap = map.descendingMap();
        System.out.println("Reversed Map: "+reversedMap);

        //poll and remove first, last entries
        entry = map.pollFirstEntry();
        System.out.println("First Entry is "+entry);
        System.out.println("Updated Map: "+map);
        entry = map.pollLastEntry();
        System.out.println("Last Entry is "+entry);
        System.out.println("Updated Map: "+map);

        //submap example
        Map<Integer, String> subMap = map.subMap(2, true, 6, true);
        System.out.println("Submap: "+subMap);

        //headmap
        subMap = map.headMap(5, true);
        System.out.println("HeadMap: "+subMap);

        //tailmap
        subMap = map.tailMap(5, true);
        System.out.println("TailMap: "+subMap);
    }
}
