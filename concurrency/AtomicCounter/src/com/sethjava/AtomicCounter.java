package com.sethjava;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger counter = new AtomicInteger(0);

    public void inc(){
        counter.incrementAndGet();
    }

    public void dec(){
        counter.decrementAndGet();
    }

    public int value(){
        return counter.get();
    }
}
