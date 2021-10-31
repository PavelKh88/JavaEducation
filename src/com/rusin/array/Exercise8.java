package com.rusin.array;

public class Exercise8 {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < 6 ; i++) {
            if(i <= 2)array[i] = 3;
            else array [i] = 4;
            System.out.println(array[i]);
        }
    }
}
