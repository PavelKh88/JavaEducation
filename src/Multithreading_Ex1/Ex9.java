package Multithreading_Ex1;

public class Ex9 {

      volatile public static int[] array = new int[10];

    public static void main(String[] args) {
        GenerateValue generateValue = new GenerateValue();
        CheckArrayThread checkArrayThread = new CheckArrayThread();
        generateValue.start();
        checkArrayThread.start();

    }

}

class GenerateValue extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Ex9.array.length ; i++) {
            try {
                Ex9.array [i] = 10 + (int)(Math.random()*((99 - 10) + 1)) ;
              //  System.out.println(Ex10.array[i]);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class CheckArrayThread extends Thread {

    @Override
    public void run() {
        checkArray();
    }
    public void checkArray() {
        for (int i = 0; i < Ex9.array.length ; i++) {
               if(Ex9.array[i] == 0) {
                   try {
                       Thread.sleep(3000);
                       checkArray();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   } if(i == Ex9.array.length - 1) {
                       for (int j = 0; j < Ex9.array.length ; j++) {
                           System.out.println(Ex9.array[j]);
                       }
                   }
               }
            }
        }
    }

