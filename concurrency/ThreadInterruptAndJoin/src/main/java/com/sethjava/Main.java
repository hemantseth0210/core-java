package com.sethjava;

import static com.sethjava.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from main thread.");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        // 4th way of creating thread
        Thread myRunnableAnonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Hello from My Runnable Anonymous class thread.");
                try {
                    anotherThread.join();
                    //anotherThread.join(2000);
                    System.out.println(ANSI_CYAN + "Another thread terminated, so I'm running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_CYAN + "I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableAnonymousThread.start();

        // This is how the interrupt method needs to be called on Thread instance.
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from main thread.");

    }
}
