package com.sethjava;


import static com.sethjava.Main.lock1;
import static com.sethjava.Main.lock2;

public class Thread1 extends Thread {
    public void run(){
        synchronized (lock1){
            System.out.println("Thread 1 : has lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1: waiting for lock 2");
            synchronized (lock2){
                System.out.println("Thread 1: has lock1 and lock2");
            }
            System.out.println("Thread 1: Released lock2");
        }
        System.out.println("Thread 1: Released lock1. Exiting...");
    }
}
