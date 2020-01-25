package com.sethjava.lambda;

//Anonymous can be used for the interfaces which have more than 1 abstract methods.
//However Lambda can be used only if the interface has only one abstract methods.
public class AnonymousVsLambda {

    public static void main(String[] args) {
	    Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hey Anonymous inner class");
            }
        };
	    greeting.greet();

	    Greeting greetingLambda = () -> System.out.println("Hey Lambda");
	    greetingLambda.greet();
    }
}

interface Greeting{
    void greet();
}