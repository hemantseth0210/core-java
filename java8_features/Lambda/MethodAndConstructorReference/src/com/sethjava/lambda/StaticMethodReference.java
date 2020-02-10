package com.sethjava.lambda;

public class StaticMethodReference {
    public static void main(String[] args) {
        // Static Method reference
        Thread thread = new Thread(StaticMethodReference::display);
        thread.start();
    }

    public static void display(){
        for(int i = 0; i<10; i++){
            System.out.println("Child Thread1");
        }
    }

}
