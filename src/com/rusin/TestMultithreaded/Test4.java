package com.rusin.TestMultithreaded;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Resourse resourse = new Resourse();
        resourse.setI(5);
        MyThread3 myThread1 = new MyThread3();
        MyThread3 myThread2 = new MyThread3();
        myThread1.setResourse(resourse);
        myThread2.setResourse(resourse);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(resourse.getI());
    }
}
class MyThread3 extends Thread {
  Resourse resourse;

    public void setResourse(Resourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public synchronized void run() {
    resourse.changeI();
    }

}
class Resourse {
   static int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public synchronized void changeI() {
        int i = this.i;
        i++;
        this.i = i;
    }

}