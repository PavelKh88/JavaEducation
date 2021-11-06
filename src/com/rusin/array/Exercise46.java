package com.rusin.array;

public class Exercise46 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println(" Sum all alements in array = " + sum);

    }
}
