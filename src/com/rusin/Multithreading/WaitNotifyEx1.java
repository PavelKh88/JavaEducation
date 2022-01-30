package com.rusin.Multithreading;

public class WaitNotifyEx1 {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();


    }
}

class Market {
    private int breadCount = 0;
    final static Object lock = new Object();

    public  void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            breadCount--;
            System.out.println("Consumer buy 1 bread ");
            System.out.println("Value bread in market = " + breadCount);
            lock.notify();
        }
    }

    public  void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            breadCount++;
            System.out.println("Producer add to Market 1 bread");
            System.out.println("Value bread in market = " + breadCount);
            lock.notify();
        }
    }
}

class Producer implements Runnable {
    Market market;

    Producer(Market market) {
        this.market = market;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}

