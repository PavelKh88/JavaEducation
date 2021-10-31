package com.rusin.array;

public class Exercise10 {
    public static void main(String[] args) {
        int[] array = new int[25];
        int a =106;
        for (int i = 0; i < 25 ; i++) {
            array[i] = a;
            a++;
        }
        for (int i:array)
        {
            System.out.println(i);
        }
    }
}
