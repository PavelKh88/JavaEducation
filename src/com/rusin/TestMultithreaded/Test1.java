package com.rusin.TestMultithreaded;

public class Test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
        Myrunnable myrunnable = new Myrunnable();
        Thread thread2 = new Thread(myrunnable);
        thread2.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

    private void someMetod() {
        throw new RuntimeException();
    }
}
 class Myrunnable implements Runnable {
        @Override
     public void run () {
            System.out.println(Thread.currentThread().getName());
        }
    }

