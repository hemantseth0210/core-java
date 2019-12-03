package com.sethjava;

public class Main {

    public static void main(String[] args) {
	    Counter counter = new Counter();
        new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i = 0; i<100; i++){
                   counter.inc();
                   System.out.println("Thread 1 : "+ counter.value());
               }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++){
                    counter.inc();
                    System.out.println("Thread 2 : "+ counter.value());
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++){
                    counter.inc();
                    System.out.println("Thread 3 : "+ counter.value());
                }
            }
        }).start();
    }
}
