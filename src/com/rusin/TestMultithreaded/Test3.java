package com.rusin.TestMultithreaded;

public class Test3 {
    public static void main(String[] args) throws Exception {
    MyThread2 myThread2 = new MyThread2();
    myThread2.start();
    myThread2.join();
        System.out.println("Thread main");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
//        System.out.println("thread  = 0");
        for (int i = 0; i < 50; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
