package Multithreading_Ex1;

public class Ex8 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Ex8 ex8 = new Ex8();
        ex8.generateThreade();

    }
    public void generateThreade() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            new Thread(){ public void run() {
                System.out.println("Hello from " + Thread.currentThread().getName());
            }}.start();

        }
    }
}


