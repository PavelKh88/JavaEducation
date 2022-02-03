package Multithreading_Ex1;

public class Ex10 {
    public static volatile int balance = 1000;

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
        for (int i = 0; i < 5; i++) {
            Ex10.balance += 10;
            System.out.println("Deposit + 10 ");
        }
    }
}

class Withdraw extends Thread {
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            Ex10.balance -= 5;
            System.out.println("Withdraw - 10 ");
        }
    }
}
