package com.sethjava.java8;

public class StaticMethodInterface {
    public static void show(){
        System.out.println("This interface static method");
    }
    public static void show(String s){
        System.out.println("This interface static method with argument: " + s);
    }

    public static void main(String[] args) {
        System.out.println("Interface can also have main method java 1.8 onwards");
    }
}
