package com.rusin.TestMultithreaded;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Resourse1 resourse = new Resourse1();
        Resourse1.i = 5;
        MyThread4 myThread1 = new MyThread4();
        MyThread4 myThread2 = new MyThread4();
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(resourse.getI());
    }
}
class MyThread4 extends Thread {
    Resourse1 resourse;

    public void setResourse(Resourse1 resourse) {
        this.resourse = resourse;
    }

    @Override
    public synchronized void run() {
        Resourse1.changeStaticI();
    }

}
class Resourse1 {
    static int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

//    public synchronized void changeI() {
//        int i = this.i;
//        i++;
//        this.i = i;
//    }

    public synchronized static void changeStaticI() {
        int i = Resourse1.i;
        i++;
        Resourse1.i = i;
    }

}