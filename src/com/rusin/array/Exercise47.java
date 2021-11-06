package com.rusin.array;

public class Exercise47 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt % 1 == 0) {
                System.out.println(i + " " + (int) sqrt);
            }
        }
    }
}
