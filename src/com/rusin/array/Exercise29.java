package com.rusin.array;

public class Exercise29 {
    public static void main(String[] args) {
        int[] array = new int[] {0, 0, -123, 43, 6, 8, -999, 1000, 9877, -234};

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
            System.out.println(array[i]);
        }
    }
}
