package Multithreading_Ex1;

public class Ex7 {
    public static void main(String[] args) {
    FirstThread1 thread1 = new FirstThread1();
    thread1.start();
    }
}

class FirstThread1 extends Thread {

    public void run() {

        try {
            Thread.sleep(3000);
            Thread.currentThread().setName("name 1");
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            for (int i = 0; i < 5 ; i++) {
         new Thread() { public void run(){
             Thread.currentThread().setName("name 1");
            System.out.println(Thread.currentThread().getName());
        }}.start();



    }
}

}
