package com.rusin.loops;

public class Exercise36_v1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 1;

        int count = 1;
        for (int i = 1; i <= 6  ; i++) {
            for (int j = 1 ; j <= a ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= b ; j++) {
                System.out.print(count + " ");
                count++;
                if(count == 10) count = 1;
            }

            System.out.println();
            a--;b++;
        }

    }
}
