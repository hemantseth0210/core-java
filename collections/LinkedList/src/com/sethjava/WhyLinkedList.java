package com.sethjava;

import java.util.ArrayList;
import java.util.List;

// This shifting of elements will be a problem in case of big arrays
public class WhyLinkedList {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i+ " : "+ intList.get(i));
        }

        intList.add(1, 50);
        for(int i=0; i<intList.size(); i++){
            System.out.println(i+ " : "+ intList.get(i));
        }

    }
}
