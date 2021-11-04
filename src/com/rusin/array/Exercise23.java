package com.rusin.array;

public class Exercise23 {
    public static void main(String[] args) {
        int[][] array = new int[][] {{4, 6, 8, 6, 4, 3, 6, 33, 6, 4, 2},
                                            { 5, 8, 7}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ;count++;

            }
        }
        int[] array2 = new int[count];
            int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array2[count2] = array[i][j];
                count2++;
            }
        }

        for (int i:array2)
        {
            System.out.println(i);
        }

    }

}
