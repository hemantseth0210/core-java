package com.sethjava.lambda;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a+b)%2 == 0;
        System.out.println(biPredicate.test(10, 20));
        System.out.println(biPredicate.test(10, 25));
    }
}
