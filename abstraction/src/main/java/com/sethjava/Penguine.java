package com.sethjava;

public class Penguine extends Bird {

    public Penguine(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good at flying, can I go for swimming instead?");
    }
}
