package com.sethjava;

public class Main {

    public static void main(String[] args) {
	    PolitePerson david = new PolitePerson("David");
        PolitePerson john = new PolitePerson("John");

        //david.sayHello(john);
        //john.sayHello(david);

        new Thread(new Runnable() {
            @Override
            public void run() {
                david.sayHello(john);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(david);
            }
        }).start();


    }
}
