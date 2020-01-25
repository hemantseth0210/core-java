package com.sethjava.lambda;

public class RunnableExample {

    public static void main(String[] args) {
	    Thread myRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable Thread");
            }
        });
        myRunnableThread.start();

        Thread myLambdaThread = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println("My Lambda Thread");
            }
        });
        myLambdaThread.start();
    }
}
