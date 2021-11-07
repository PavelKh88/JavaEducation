package com.rusin.array;

public class Exercise57ConditionProblem {
    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 5, 7, 3, 8, 34, 234, 17, 19, 21, 44, 55, 67, 99, 100};
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 == 0) System.out.print(" " + array[i] +  " ");
        }
    }
}
