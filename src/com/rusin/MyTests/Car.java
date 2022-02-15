package com.rusin.MyTests;

public class Car implements Runnable {
    public  int speed = 0;
    private   String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "Start");
        while (speed < 1000) {
            speed += 5;

            System.out.println(Thread.currentThread().getName() + name + "Speed is : " + speed + "+5 ");
//
//            try {
//              //  Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
            System.out.println(Thread.currentThread().getName() + name + "Speed is : MAX ");
    }
}
