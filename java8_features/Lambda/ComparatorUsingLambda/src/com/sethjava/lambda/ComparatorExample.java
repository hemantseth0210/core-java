package com.sethjava.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
	    List<Integer> intList = Arrays.asList(10, 5, 20, 35, 25, 30);
        System.out.println(intList);
        //Collections.sort(intList, new MyComparator());
        Comparator<Integer> myComparatorLambda = (o1, o2) -> o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
        Collections.sort(intList, myComparatorLambda);
        System.out.println(intList);
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
    }
}