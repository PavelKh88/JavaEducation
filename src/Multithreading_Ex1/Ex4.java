package Multithreading_Ex1;

public class Ex4 {
    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        Thread5 thread5 = new Thread5();
        Thread6 thread6 = new Thread6();
        Thread7 thread7 = new Thread7();
        Thread8 thread8 = new Thread8();
        Thread9 thread9 = new Thread9();
        Thread10 thread10 = new Thread10();
        Thread11 thread11 = new Thread11();
        Thread12 thread12 = new Thread12();
        Thread13 thread13 = new Thread13();
        Thread14 thread14 = new Thread14();
        Thread15 thread15 = new Thread15();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();
        thread15.start();

    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread4 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread5 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread6 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread7 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread8 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}
class Thread9 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread11 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread12 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread13 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread14 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}

class Thread15 extends Thread {
    public void run() {
        System.out.println("Thread name " + Thread.currentThread().getName() + " generate : " + (int) (10 + Math.random() * 20));
    }
}






