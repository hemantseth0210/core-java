package com.sethjava;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Seth";
        System.out.println("SIBTest static initialization block is called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor is called");
    }

    static {
        System.out.println("SIBTest second static initialization block is called");
    }

    public void someMethod(){
        System.out.println("SIBTest someMethod is called");
    }
}
