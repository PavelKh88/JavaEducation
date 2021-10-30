package com.rusin.loops;

public class Exercise35 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" " + b + " ");
                b++;
            }
            a++;

            System.out.println();
        }
        System.out.println();
            int s = 6;
            int h = 1;
            int w = 1;
            for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j <= s ; j++) {
                System.out.print(" ");
            }
            s--;
            for (int j = 1; j <=h; j++) {
                System.out.print(w + " ");
                w++;
            }
            h++;
            System.out.println();
        }
    }
}
