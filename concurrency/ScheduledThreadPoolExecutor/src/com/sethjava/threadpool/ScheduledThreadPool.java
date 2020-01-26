package com.sethjava.threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        //schedule to run after sometime
        System.out.println("Current Time = "+new Date());
        for(int i=0; i<3; i++){
            Thread.sleep(1000);
            WorkerThread worker = new WorkerThread("do heavy processing");
            scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
            // schedule task to execute at fixed rate
           /* scheduledThreadPool.scheduleAtFixedRate(worker, 0, 10,
                    TimeUnit.SECONDS);
            scheduledThreadPool.scheduleWithFixedDelay(worker, 0, 1,
                    TimeUnit.SECONDS);*/
        }

        //add some delay to let some threads spawn by scheduler
        Thread.sleep(30000);

        scheduledThreadPool.shutdown();

        System.out.println("Finished all threads");
    }
}