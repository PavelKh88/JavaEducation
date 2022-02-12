package com.rusin.Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphorEx1 {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
         new Person("Zaur", callBox);
         new Person("Oleg", callBox);
         new Person("Elena", callBox);
         new Person("Viktor", callBox);
         new Person("Marina", callBox);

    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person (String name, Semaphore callBox) {
            this.name = name;
            this.callBox =callBox;
            this.start();
    }
    public void run() {
        try {
        System.out.println(name + " Wait...");
            callBox.acquire();
        System.out.println(name + " use telephone");
        Thread.sleep(2000);
            System.out.println(name + " and use Telephone");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}