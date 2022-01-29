package com.rusin.Multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("moy potok");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("name of MyThread5 = " + myThread5.getName() + " Priority of MyThread5 = " +
                            myThread5.getPriority());

//    MyThread5 myThread6 = new MyThread5();
//        System.out.println("name of MyThread6 = " + myThread6.getName() + " Priority of MyThread6 = " +
//                myThread6.getPriority());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("privet");
    }
}
