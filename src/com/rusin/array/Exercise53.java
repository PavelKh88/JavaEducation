package com.rusin.array;

public class Exercise53 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 7, 16, 20, 3, 23, 30, 29, 4, 6, 8, 56, 32, 213, 53, 423, 7, 324, 442};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] <= 15 || array[i] >= 35)count++;
        }
        int[] array2 = new int[count];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 15 || array[i] >= 35) {
                array2[count2] = array[i];
                count2++;
            }
        }
            for (int s:array2)
            {
                System.out.println(s);
            }

    }
}
