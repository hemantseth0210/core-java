package com.sethjava.java8;

interface Interf{
    default void show(){
        System.out.println("This is interface default method");
    }
}

public class OverrideDefaultMethod {
    public void show(){
        System.out.println("This is overriden default method");
    }
    public static void main(String[] args) {
        OverrideDefaultMethod demo = new OverrideDefaultMethod();
        demo.show();
    }
}
