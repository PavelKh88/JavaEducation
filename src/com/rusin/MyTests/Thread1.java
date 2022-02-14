package com.rusin.MyTests;

public class Thread1 extends Thread{
    @Override
    public void run() {
        while (Car.speed > 0 ) {
            Car.speed -= 5;
            Thread.currentThread().setName("THREAD");
            System.out.println(Thread.currentThread().getName() + Car.name + "Speed is : " + Car.speed + " - 5");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
