package com.rusin.loops;

public class Exersice30_1 {
    public static void main(String[] args) {
        int a = 1;

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j <a ; j++) {
                System.out.print(" ");
            }
                a++;
            for (int j = 0; j <2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
