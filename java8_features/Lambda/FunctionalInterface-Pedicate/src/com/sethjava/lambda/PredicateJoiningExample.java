package com.sethjava.lambda;

import java.util.function.Predicate;

public class PredicateJoiningExample {
    public static void main(String[] args) {
        int[] intArray = {0,5,10,15,20,25,30,35};
        Predicate<Integer> predicate1 = i -> i%2 == 0;
        Predicate<Integer> predicate2 = i -> i > 10;

        // and
        System.out.println("The numbers which are even and greater than 10");
        for(int x : intArray){
            if(predicate1.and(predicate2).test(x))
                System.out.println(x);
        }

        // or
        System.out.println("The numbers which are even or greater than 10");
        for(int x : intArray){
            if(predicate1.or(predicate2).test(x))
                System.out.println(x);
        }

        // negate
        System.out.println("The numbers which are not even");
        for(int x : intArray){
            if(predicate1.negate().test(x))
                System.out.println(x);
        }
    }
}
