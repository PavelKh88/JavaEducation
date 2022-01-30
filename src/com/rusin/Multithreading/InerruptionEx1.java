package com.rusin.Multithreading;

public class InerruptionEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Start");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();

        System.out.println("Main and");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run(){
        for (int i = 0; i <= 1000000000 ; i++) {
            if(isInterrupted()) {
                System.out.println("Potok Hotyt Prirvat");
                System.out.println("Proveryli sostoyanie i Zavershili potok");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum +=Math.sqrt(i);
            try {
                 sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Potok hotyat prirvat vo vremya sna!! " +
                                    "Davayte Zavershim ego robotu!");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}