package com.rusin.array;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = new int [4];
        for (int i = 0; i <4 ; i++) {
            array[i] = i;
        }
        for (int i :array)
        {
            System.out.println(i);
        }
    }
}
