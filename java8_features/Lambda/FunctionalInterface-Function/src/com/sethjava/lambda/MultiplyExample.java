package com.sethjava.lambda;

import java.util.function.Function;

public class MultiplyExample {

    public static void main(String[] args) {
        Function<Integer, Integer> function = i -> i*i;
        System.out.println("Multiply is " + function.apply(5));
    }
}
