package com.rusin.array;

import java.util.Arrays;

public class Exercise49 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.print(" ," + array[i]);
        }
    }
}
