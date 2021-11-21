package com.rusin.array;

public class Exercise44Problem {
    public static void main(String[] args) {
        int[] array = new int[]{ 1, 2, 3, 2, 3, 2 };
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(i == j)continue;
                if(array[i] / array[j] == 1) sum += array[i];

                System.out.print(array[j]);


            }
            System.out.println("sum " + sum);
        }
    }
}