package com.rusin.loops;

public class Exercise34_1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= a ; j++) {
                System.out.print(b + " ");
            }
            a++;b++;
            System.out.println();
            
        }
    }
}
