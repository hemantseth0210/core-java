package com.sethjava;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList items  = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        // This causes the runtime ClassCastException
        //items.add("seth");
        items.add(4);
        items.add(5);

        ArrayList<Integer> items1  = new ArrayList<>();
        items1.add(1);
        items1.add(2);
        items1.add(3);
        items1.add(4);
        items1.add(5);


        printDoubled(items);
        printDoubledGenerics(items);
    }

    private static void printDoubled(ArrayList n){
        for(Object i : n){
            System.out.println((Integer) i * 2);
        }
    }

    private static void printDoubledGenerics(ArrayList<Integer> n){
        for(Integer i : n){
            System.out.println(i * 2);
        }
    }
}
