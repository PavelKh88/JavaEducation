package com.rusin.array;

public class Exercise1 {
    public static void main(String[] args) {

        int[] array = new int[6];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
