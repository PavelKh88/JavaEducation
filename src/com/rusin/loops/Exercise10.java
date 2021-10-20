package com.rusin.loops;

public class Exercise10 {
    public static void main(String[] args) {
       for (int i = 0; i <5 ; i++) {
           if(i % 2!=0) System.out.print(" ");
           for (int j = 0; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }
}
