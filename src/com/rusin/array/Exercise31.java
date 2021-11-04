package com.rusin.array;

public class Exercise31 {
    public static void main(String[] args) {
        double[] array = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
        double a = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }
        System.out.println("summ all avarible in array = " + a);
    }
}
