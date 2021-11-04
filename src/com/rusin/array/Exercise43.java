package com.rusin.array;

public class Exercise43 {
    public static void main(String[] args) {
        int[] array = new int[] {6, 5, 4, -7, -3, 3, 5, 2, 6, 8, -4, -7, -1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0) sum += array[i];
        }
        System.out.println("Sum all negative elements in array = " + sum );
    }
}
