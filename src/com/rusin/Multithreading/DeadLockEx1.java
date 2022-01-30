package com.rusin.Multithreading;

public class DeadLockEx1 {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thred10 thred10 = new Thred10();
        Thred20 thred20 =  new Thred20();
        thred10.start();
        thred20.start();
    }
}

class Thred10 extends Thread{
    public void run(){
        System.out.println("Thread10 : attempt to capture monitor lock 1 ");
        synchronized (DeadLockEx1.lock1) {
            System.out.println("Thread10 : object monitor lock 1 captured " );
            System.out.println("Thread10 : attempt to capture monitor lock 2 ");
            synchronized (DeadLockEx1.lock2){
                System.out.println("Thread10 : object monitor lock1 and lock 2 captured " );
            }
        }

    }
}

class Thred20 extends Thread{
    public void run(){
        System.out.println("Thread20 : attempt to capture monitor lock 2 ");
        synchronized (DeadLockEx1.lock2) {
            System.out.println("Thread20 : object monitor lock 2 captured " );
            System.out.println("Thread20 : attempt to capture monitor lock 1 ");
            synchronized (DeadLockEx1.lock1){
                System.out.println("Thread20 : object monitor lock1 and lock 1 captured " );
            }
        }

    }
}