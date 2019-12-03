package com.sethjava;

import static com.sethjava.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from main thread.");
        // 1st way of creating thread
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        // 2nd way of creating thread
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread.");
            }
        }.start();

        // 3rd way of creating thread
        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        // 4th way of creating thread
        Thread myRunnableAnonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Hello from My Runnable Anonymous class thread.");
            }
        });
        myRunnableAnonymousThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from main thread.");

    }
}
