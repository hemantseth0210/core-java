package com.sethjava;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock reentrantLock;

    public MyProducer(List<String> buffer, String color, ReentrantLock reentrantLock) {
        this.buffer = buffer;
        this.color = color;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1","2","3","4","5"};
        for(String num : nums){
            try{
                System.out.println(color + "Adding..." + num);
                /*
                synchronized (buffer){
                    buffer.add(num);
                }
                */
                reentrantLock.lock();
                try{
                    buffer.add(num);
                } finally {
                    reentrantLock.unlock();
                }
                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e) {
                System.out.println("Producer was interrupted.");
            }
        }
        System.out.println(color + "Adding EOF and exiting..");
       /* synchronized (buffer){
            buffer.add("EOF");
        }
        */
        reentrantLock.lock();
        try{
            buffer.add("EOF");
        } finally {
            reentrantLock.unlock();
        }
    }
}
