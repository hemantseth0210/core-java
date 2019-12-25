package com.sethjava;

public class Main {

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //one.instanceNumber = 9;

        int pw = 674312;
        Password password = new Password(pw);
        //Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(2343);
        password.letMeIn(345634);
        password.letMeIn(45675);
        password.letMeIn(678);
        password.letMeIn(674312);
    }
}
