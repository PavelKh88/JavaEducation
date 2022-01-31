package Multithreading_Ex1;

public class Ex1 {
    public static void main(String[] args) {
    Sqr sqr = new Sqr();
    sqr.start();

    }
}

 class Sqr extends Thread {
    @Override
     public void run(){
        System.out.println(Math.sqrt(100));
    }

}