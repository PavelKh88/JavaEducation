package com.rusin.array;

public class Exercise42 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 67, 5, -34, -6, -5, 6, -5, -7, -8, -5, -4};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] < 0 && array[i + 1] < 0) sum += array[i] +array[i+1];
            if(array[i] < 0 && array[i + 1] < 0 && array[i - 1] < 0) sum -= array[i];
        }
        System.out.println(sum);
    }
}
