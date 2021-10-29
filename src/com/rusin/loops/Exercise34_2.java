package com.rusin.loops;

public class Exercise34_2 {
    public static void main(String[] args) {
        int b = 7;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= b ; j++) {
                System.out.print(b + " ");
            }
            b--;
            System.out.println();

        }
    }
}
