package com.rusin.array;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10 ; i++) {
            array[i] = 5;
        }
        for (int i:array)
        {
            System.out.println(i);
        }
    }
}
