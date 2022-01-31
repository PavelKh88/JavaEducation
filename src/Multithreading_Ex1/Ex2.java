package Multithreading_Ex1;

public class Ex2 {
    public static void main(String[] args) {
        WriteNumber writeNumber = new WriteNumber();
        Thread thread = new Thread(writeNumber);
        thread.start();
    }
}

class WriteNumber implements Runnable {
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
    }
        }