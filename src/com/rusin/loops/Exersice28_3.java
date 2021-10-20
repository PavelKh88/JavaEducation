package com.rusin.loops;

public class Exersice28_3 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 1 ; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.println(j);

                for (int k = 0; k <= a ; k++) {
                    System.out.print(" ");

                }
                a++;
            }

            System.out.println();
        }
    }
}
