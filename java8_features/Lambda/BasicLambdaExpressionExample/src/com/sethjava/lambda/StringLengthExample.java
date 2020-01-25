package com.sethjava.lambda;

public class StringLengthExample {
    public static void main(String[] args) {
        StringInterf stringInterf = (s) -> s.length();
        System.out.println("The length is " + stringInterf.getLength("Hello World"));
    }
}

interface StringInterf{
    int getLength(String str);
}
