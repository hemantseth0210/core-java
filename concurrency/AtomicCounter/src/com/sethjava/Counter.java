package com.sethjava;

public class Counter {
    private volatile int counter = 0;

    public void inc(){
        counter++;
    }
    public void dec(){
        counter--;
    }
    public int value(){
        return counter;
    }
}
