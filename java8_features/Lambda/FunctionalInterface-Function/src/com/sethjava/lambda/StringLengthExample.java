package com.sethjava.lambda;

import java.util.function.Function;

public class StringLengthExample {
    public static void main(String[] args) {
        Function<String, Integer> function = s -> s.length();
        System.out.println("Length of the string is " + function.apply("Hello Java Developers"));
    }
}
