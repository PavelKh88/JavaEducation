package com.rusin.MyTests;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche");
        Car car2 = new Car("Porsche");
            car1.start();
            car2.start();

        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        thread1.start();
        thread2.start();


    }
}
