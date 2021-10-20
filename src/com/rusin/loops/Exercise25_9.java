package com.rusin.loops;

public class Exercise25_9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 6;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 ; j++) {
                System.out.print(" " + a);
                a++;
                if (j >= 5) a = b;
                if(a >= 6) a = c;
            }
            b++;
            System.out.println();
        }
    }
}
