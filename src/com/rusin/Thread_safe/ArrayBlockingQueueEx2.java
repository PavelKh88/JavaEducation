package com.rusin.Thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue =
                new ArrayBlockingQueue<>(4);

        //Produser

        new Thread (() -> {
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Produser add : " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();


        //consumer

        new Thread (() -> {
            while (true) {
                try {
            int j = arrayBlockingQueue.take();
                    System.out.println("Consumer take : " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }
}
