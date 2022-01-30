package com.rusin.Multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImp2 runnableImp1 = new MyRunnableImp2();
        Thread thread1 = new Thread(runnableImp1);
        Thread thread2 = new Thread(runnableImp1);
        Thread thread3 = new Thread(runnableImp1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImp2 implements Runnable {
    private void doWork2() {
        System.out.println("Ura!!");
    }

    public void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count + " ");
        }
    }

    public  void run() {
        for (int i = 0; i < 3 ; i++) {
            doWork1();
        }
    }
}
