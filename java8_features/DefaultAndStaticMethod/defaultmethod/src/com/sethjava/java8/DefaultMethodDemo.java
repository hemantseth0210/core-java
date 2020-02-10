package com.sethjava.java8;

interface interf{
    default void show(){
        System.out.println("This is interface default method");
    }
}

public class DefaultMethodDemo implements interf{

    public static void main(String[] args) {
        DefaultMethodDemo demo = new DefaultMethodDemo();
        demo.show();
    }
}
