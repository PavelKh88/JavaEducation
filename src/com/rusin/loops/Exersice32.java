package com.rusin.loops;

public class Exersice32 {
    public static void main(String[] args) {
        int b = 0;

        for (int i = 1; i <= 10 ; i++) {
            b = i * i;
            System.out.print(" " + b + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1 ; i--) {
             b = i * i;
            System.out.print(" " + b + " ");
        }
    }
}
