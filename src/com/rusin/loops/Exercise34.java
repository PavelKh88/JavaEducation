package com.rusin.loops;

public class Exercise34 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 7;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 0; j <= a ; j++) {

                System.out.print(" " + i);
            }
            a++;
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 7; j >= b; j--) {

                System.out.print(" " + c);
            }
            c--;
            b++;
            System.out.println();
        }
    }
}
