package com.rusin.loops;

public class Exercise34_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= b ; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
            b++;a = 1;
        }
    }
}
