package com.rusin.array;

public class Exercise36 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 8, 90, 0, 40, 32, 64, 22, 76};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
