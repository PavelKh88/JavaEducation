package com.rusin.MyTests;

public class Car extends Thread {
    public static int speed = 0;
    public static String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (speed < 100) {
            speed += 5;

            System.out.println(Thread.currentThread().getName() + Car.name + "Speed is : " + speed + "+5 ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
            System.out.println(Thread.currentThread().getName() + Car.name + "Speed is : MAX ");
    }
}
