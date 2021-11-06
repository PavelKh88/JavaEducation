package com.rusin.array;

public class Exercise45 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 7, 8, 45, 123, 4, 78, 5, 6, 7, 8, 9, 0, 23, 4, 34};
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];

        }
        System.out.println("Sum of every second elements = " + sum);
    }
}
