package com.rusin.array;

import java.util.Arrays;

public class Exercise55 {
    public static void main(String[] args) {
        int[] array = new int[] {6, 34, 654, 76, 6723, 4, 5, 4, 43, 42, 6, 67, 2, 4};
       int max1 = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max1) max1 = array[i];
        }
        System.out.println("first max value = " + max1);
        int max2 = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == max1)continue;
            if(array[i] > max2) max2 = array[i];
        }
        System.out.println(" second msx value = " + max2);
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
        System.out.println(array[array.length - 2]);
    }
}
