package com.rusin.array;

public class Exercise37 {
    public static void main(String[] args) {
        int[] array = new int[] {6, 5, 3, -44, -5, 0, 5, -11, 4, 0, 3, 4, -54, -43};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) sum += array[i];
        }
        System.out.println(sum);
    }
}
