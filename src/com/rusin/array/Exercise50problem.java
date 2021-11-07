package com.rusin.array;

public class Exercise50problem {
    public static void main(String[] args) {
        int[] array = new int[]{-4, 5, -23, -1234, 456, 7, -44, -1, 45, 23, 23, 1, 2};
            int min = array[0];
            int min1 = 0;
            int min2 = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < 0) min1 = array[i] * -1 ;
            if(array[i] < min1)min2 = array[i] * -1;
            else if (array[i] < min) min = array[i];

        }
        System.out.println(min);
        System.out.println(min1);
    }
}
