package com.rusin.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx1 {
    public static void main(String[] args) {
    Call call = new Call();


    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.mobileCall();
        }
    });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.watsAppCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile Call starts");
            Thread.sleep(3000);
            System.out.println("Mobile Call ands");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("skype Call starts");
            Thread.sleep(5000);
            System.out.println("skype Call ands");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    void watsAppCall(){
        lock.lock();
        try {
            System.out.println("watsApp Call starts");
            Thread.sleep(7000);
            System.out.println("watsApp Call ands");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
