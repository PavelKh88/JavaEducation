package com.rusin.loops;

public class Exercise34_5 {
    public static void main(String[] args) {
        int a = 1;
        double b = 1;
        int c = (int) b;
        for (int i = 1; i <= 8 ; i++) {
            for (int j = 1; j <= a ; j++) {
                System.out.print((int)b + " ");
            }
            a++;
            System.out.println();
            b = 0.5 * a * (a + 1);


        }
    }
}
