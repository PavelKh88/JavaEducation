package com.rusin.Multithreading;

import javax.swing.plaf.IconUIResource;

public class Ex10 {
    public static void main(String[] args) {
        MyRunnableImp1 runnableImp1 = new MyRunnableImp1();
        Thread thread1 = new Thread(runnableImp1);
        Thread thread2 = new Thread(runnableImp1);
        Thread thread3 = new Thread(runnableImp1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImp1 implements Runnable {
    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    public void run() {
        for (int i = 0; i < 3 ; i++) {
            increment();
        }
    }
}
