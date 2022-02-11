package com.rusin.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
   //     ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10 ; i++) {
            executorService.execute(new RunnableImpl100());
        }
        executorService.shutdown();
     //   executorService.awaitTermination(5, TimeUnit.SECONDS);
      //  System.out.println("Main ands");

    }
}

class RunnableImpl100 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "And");
    }
}
