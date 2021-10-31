package com.rusin.array;

public class Exercise6 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < 12 ; i++) {
            array[i] = 1;
        }
        for (int i:array)
        {
            System.out.println(i);
        }
    }
}
