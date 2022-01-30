package com.rusin.Multithreading;

public class Ex12 {
    static final Object lock = new Object();

    void mobileCallStart() {
        synchronized (lock) {

            System.out.println("mobile Call start!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mobile Call and!!!");
        }
    }

    void skypeCallStart() {
        synchronized (lock) {
            System.out.println("skype Call start!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype Call and!!!");
        }
    }

    void whatsAppCallStart() {
        synchronized (lock) {
            System.out.println("whatsApp Call start!");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("whatsApp Call and!!!");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable{
    public void run() {
        new Ex12().mobileCallStart();
    }
}

class RunnableImpSkype implements Runnable{
    public void run() {
        new Ex12().skypeCallStart();
    }

}
class RunnableImpWhatsApp implements Runnable{
    public void run() {
        new Ex12().whatsAppCallStart();
    }
}
