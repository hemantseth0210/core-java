package com.sethjava.lambda;

public class AddExample {
    public static void main(String[] args) {
        SumInterf sumInterf = (a, b) -> System.out.println("The sum is " + (a + b));
        sumInterf.add(10, 20);
    }
}

interface SumInterf{
    public void add (int a, int b);
}
