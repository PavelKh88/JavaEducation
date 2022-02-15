package com.rusin.MyTests;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche");
        Car car2 = new Car("Fiat");
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        thread1.start();
        thread2.start();

        }



    }

