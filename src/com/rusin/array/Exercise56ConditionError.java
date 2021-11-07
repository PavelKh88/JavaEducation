package com.rusin.array;

public class Exercise56ConditionError {
    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 5, 0, 6, 4, -6, -4, 5};
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min) min = array[i];
        }
        System.out.println("first min value = " + min);
        int min2 = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == min)continue;
            if(array[i] < min2) min2 = array[i];
        }
        System.out.println("second min value = " + min2);
    }
}
