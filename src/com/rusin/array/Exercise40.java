package com.rusin.array;

public class Exercise40 {
    public static void main(String[] args) {
        int[] array = new int[] {5, -7, -3, 5, 6, -99, -34, 0, 34, 2, 7, 89, 3, 4, -1, 5, -1, -2};
       int mult = 1;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < 0) mult *= array[i];
        }
        System.out.println("Multiplication all value negative elements : " + mult);
    }
}
