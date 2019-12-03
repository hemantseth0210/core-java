package com.sethjava;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MyConsumer implements Runnable {

    private static final String EOF = "EOF";
    private List<String> buffer;
    private String color;
    private ReentrantLock reentrantLock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock reentrantLock) {
        this.buffer = buffer;
        this.color = color;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        while(true){
            /*synchronized (buffer){
                if(buffer.isEmpty()){
                    continue;
                }
                if(buffer.get(0).equals(EOF)){
                    System.out.println(color + "Exiting");
                    break;
                } else{
                    System.out.println(color + "Removed "+buffer.remove(0));
                }
            }
             */
            reentrantLock.lock();
            try{
                if(buffer.isEmpty()){
                    continue;
                }
                if(buffer.get(0).equals(EOF)){
                    System.out.println(color + "Exiting");
                    break;
                } else{
                    System.out.println(color + "Removed "+buffer.remove(0));
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
