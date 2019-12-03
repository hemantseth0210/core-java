package com.sethjava;

import static com.sethjava.Main.lock1;
import static com.sethjava.Main.lock2;

public class Thread2 extends Thread {
    public void run(){
        synchronized (lock2){
            System.out.println("Thread 2 : has lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2: waiting for lock 1");
            synchronized (lock1){
                System.out.println("Thread 2: has lock2 and lock1");
            }
            System.out.println("Thread 2: Released lock1");
        }
        System.out.println("Thread 2: Released lock2. Exiting...");
    }
}
