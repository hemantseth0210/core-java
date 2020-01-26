package com.sethjava.lambda;

import java.util.function.Consumer;

public class PrintExample {

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello from Consumer function");
    }
}
