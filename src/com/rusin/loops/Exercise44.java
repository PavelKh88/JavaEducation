package com.rusin.loops;

public class Exercise44 {
    public static void main(String[] args) {
        int a = 1;
        int b = a % 2;
        for (int i = 1; i <= 13 ; i++) {
            for (int j = 1; j <= 3 ; j++) {
               if(b == 0) System.out.print(" * ");
               //else if(j == 2) System.out.print(" * ");
            }
            System.out.println();a++;
        }
    }
}
