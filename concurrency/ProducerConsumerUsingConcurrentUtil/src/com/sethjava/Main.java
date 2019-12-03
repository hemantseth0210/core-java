package com.sethjava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
	    List<String> buffer = new ArrayList<>();
        ReentrantLock reentrantLock = new ReentrantLock();

        // Using Executor Service ThreadPool
        ExecutorService executorService = Executors.newFixedThreadPool(5);

	    MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN, reentrantLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, reentrantLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, reentrantLock);

        //new Thread(producer).start();
        //new Thread(consumer1).start();
        //new Thread(consumer2).start();

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        // Using callable in executor service to get result
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_RED + "I am being printed from callable class");
                return "This is the callable result";
            }
        });

        try{
            System.out.println(future.get());
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_RED + "Thread running the task was interrupted");
        } catch (ExecutionException e) {
            System.out.println(ThreadColor.ANSI_RED + "Something went wrong");
        }

        executorService.shutdown();
    }
}
