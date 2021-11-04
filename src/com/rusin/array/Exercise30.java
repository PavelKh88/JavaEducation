package com.rusin.array;

public class Exercise30 {
    public static void main(String[] args) {
        int[] array = new int[8];
       int a = 0;
        for (int i = 0; i < array.length; i++) {

            a = a * 10 + 1;
            array[i] = a;
            System.out.println(array[i]);
        }
    }
}
