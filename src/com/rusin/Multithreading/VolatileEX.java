package com.rusin.Multithreading;

public class VolatileEX extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEX thread = new VolatileEX();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!!!");
        thread.b = false;
        thread.join();
        System.out.println("End of programm");
    }
}