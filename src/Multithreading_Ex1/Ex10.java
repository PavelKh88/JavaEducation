package Multithreading_Ex1;

public class Ex10 {
    public static int balance = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(balance);
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        deposit.start();
        withdraw.start();
        deposit.join();
        withdraw.join();
        System.out.println(balance);
    }
}

class Deposit extends Thread {
    public void run() {
        for (int i = 0; i < 50000; i++) {
           synchronized (Ex10.class) {
            Ex10.balance += 10;
          }
           // System.out.println("Deposit + 10 ");
        }
    }
}

class Withdraw extends Thread {
    public void run() {
        for (int i = 0; i < 50000 ; i++) {
           synchronized (Ex10.class) {
               Ex10.balance -= 10;
           }
          //  System.out.println("Withdraw - 10 ");
        }
    }
}
