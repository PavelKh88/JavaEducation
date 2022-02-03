package Multithreading_Ex1;

import javax.sound.midi.Soundbank;

public class Ex6 {
    public static void main(String[] args) {
        ThreadFirst threadFirst = new ThreadFirst();
        threadFirst.start();
    }
}

class ThreadFirst extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
        try {
            Thread.sleep(4000);
            class ThreadSecond extends Thread{
                public void run() {
                    System.out.println("Privet from second Thread!!!");
                }
            }
                    new ThreadSecond().start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
