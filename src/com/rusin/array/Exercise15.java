package com.rusin.array;

public class Exercise15 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 54, 7, 3, 2, 6, 4, 3};
        int[] array2 = new int[8];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
            System.out.println(array2[i]);
        }

    }
}
