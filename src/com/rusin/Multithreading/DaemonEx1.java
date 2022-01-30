package com.rusin.Multithreading;

public class DaemonEx1 {
    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("User Thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon Thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();

        System.out.println("Main Thread ands");
    }

}

class UserThread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName() + "is Daemon : " + isDaemon());
        for (char i = 'A'; i <= 'J' ; i++){
            try {
                sleep(3000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class DaemonThread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName() + "is Daemon : " + isDaemon());
        for (int i = 1; i <= 1000 ; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
