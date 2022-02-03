package Multithreading_Ex1;

public class Ex5 {
    public static void main(String[] args) {
        Th1 thread1 = new Th1();
        Th2 thread2 = new Th2();
        thread1.start();
        thread2.start();
    }
}

class Th1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
        try {
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + " Stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Th2 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
        try {
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + " Stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

