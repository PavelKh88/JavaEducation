package com.rusin.Port;

public class CreatedShip extends Thread {

    public void run() {
        for (int i = 0; i < 10 ; i++) {
            new Ship();
            System.out.println(Thread.currentThread().getName() + "created Ship ");
        }
    }
}
