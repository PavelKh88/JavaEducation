package Multithreading_Ex1;

public class Ex3 {
    public static void main(String[] args) {
        SecondThread secondThread = new SecondThread();
        Thread thread1 = new Thread(secondThread);
        FirstThread thread2 = new FirstThread();
        thread1.start();
        thread2.start();
    }
}

class FirstThread extends Thread {
    public  void run() {
        for (int i = 1; i <= 3 ; i++) {
            int a = (int) (10 + Math.random() * 20);
            System.out.println("First Thread generate : "  + a);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread implements Runnable {
    public  void run(){
        for (int i = 1; i <= 3 ; i++) {
            int a = (int) (50 + Math.random() * 50);
            System.out.println("Second Thread generate : " + a);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
