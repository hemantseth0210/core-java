package com.sethjava;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguine penguine = new Penguine("Emperor");
        penguine.eat();
        penguine.breathe();
        penguine.fly();
    }
}
