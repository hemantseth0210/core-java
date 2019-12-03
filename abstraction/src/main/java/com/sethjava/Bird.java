package com.sethjava;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat");
    }

   // Since better disgn it to use the interface CanFly to add the fly behaviour
   // public abstract void fly();

    @Override
    public void fly() {
        System.out.println("Flapping it's wings");
    }
}