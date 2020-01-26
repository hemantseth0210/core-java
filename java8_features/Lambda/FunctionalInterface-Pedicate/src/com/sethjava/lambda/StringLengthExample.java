package com.sethjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringLengthExample {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("John", "David", "Richard", "Greg", "David");
        Predicate<String> predicate = s -> s.length() < 5;
        nameList.forEach(s -> {
            if (predicate.test(s))
                System.out.println(s);
        });
    }

}
