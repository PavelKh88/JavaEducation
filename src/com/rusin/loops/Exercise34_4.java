package com.rusin.loops;

public class Exercise34_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= b ; j++) {
                System.out.print(a + " ");
                a++;
            }
            a = 1;b--;
            System.out.println();
        }
    }
}
