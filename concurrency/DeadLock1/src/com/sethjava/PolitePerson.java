package com.sethjava;

public class PolitePerson {
    private final String name;

    public PolitePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void sayHello(PolitePerson politePerson){
        System.out.format("%s: %s" + " has said Hello to me!! %n", this.name, politePerson.getName());
        politePerson.sayHelloBack(this);
    }

    public synchronized void sayHelloBack(PolitePerson politePerson){
        System.out.format("%s: %s" + " has said Hello to me!! %n", this.name, politePerson.getName());
    }
}
