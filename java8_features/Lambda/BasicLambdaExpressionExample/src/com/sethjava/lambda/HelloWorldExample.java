package com.sethjava.lambda;

public class HelloWorldExample {

    public static void main(String[] args) {
	    HelloInterf helloInterf = () -> System.out.println("Hello World by Lambda expression");
        helloInterf.hello();
    }
}

interface HelloInterf{
    void hello();
}