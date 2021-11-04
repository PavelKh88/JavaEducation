package com.rusin.array;

public class Exercise39 {
    public static void main(String[] args) {
        int[] array = new int[] {34, -56, 45, 0, -66, 34, 2, 1, -67, -999, -1000, -4};
        int summ = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > 0) summ += array[i];
        }
        System.out.println("Summ all elements positive value : " + summ);
    }
}
