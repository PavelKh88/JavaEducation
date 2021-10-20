package com.rusin.loops;

public class Exersice34_5 {
    public static void main(String[] args) {
        double a = 1;
        double b;

        for (int i = 1; i <= 8 ; i++) {
            b = 0.5 * a * (a + 1);
            for (int j = 1; j <= a ; j++) {
                int h = (int) b;
                System.out.print(" " + h +" ");

            }
            a++;
            System.out.println();
        }
    }
}
