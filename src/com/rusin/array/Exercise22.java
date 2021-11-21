package com.rusin.array;

import java.util.Arrays;

public class Exercise22 {
    public static void main(String[] args) {
        int[][] array = new int[2][10];
        int count = 1;
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                array[i][j] = count;
                count++;
            }
        }
//        for (int i = 0; i < 2 ; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
        System.out.println(Arrays.deepToString(array));
    }
}
