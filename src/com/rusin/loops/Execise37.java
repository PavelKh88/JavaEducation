package com.rusin.loops;

public class Execise37 {
    public static void main(String[] args) {
        char a = 'a';
        int b = 1;
        for (int i = 1; i <= 17 ; i++) {
            for (int j = 1; j <= b ; j++) {
                System.out.print(a + " ");
            }
            a++;b++;
            System.out.println();
        }
    }
}
