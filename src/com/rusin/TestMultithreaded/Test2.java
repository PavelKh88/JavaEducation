package com.rusin.TestMultithreaded;

public class Test2 {
    public static void main(String[] args) {
       MyThread1 myThread1 =  new MyThread1();
       MyThread1 myThread2 =  new MyThread1();
       MyThread1 myThread3 =  new MyThread1();
     myThread1.start();
     myThread2.start();
     myThread3.start();

    }
}
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 400 ; i++) {
            System.out.println("Thread name is" + Thread.currentThread().getName() + " i = " + i);
        }
    }
}
