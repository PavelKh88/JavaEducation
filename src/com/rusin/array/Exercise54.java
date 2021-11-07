package com.rusin.array;

public class Exercise54 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 6, 5, 7, 34, 99, 6, 8, 32, -20, 45, -100};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i] < min) min =array[i];
            if(array[i] > max) max = array[i];

        }
        System.out.println("Max element in array = " + max + " Min element in array = " + min);
    }
}
