package com.rusin.array;

public class Exercise7 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            if(i % 2 == 0) array[i] = 101;
          //  System.out.println(array[i]);
        }

        for (int i:array) {
            System.out.println(i);
        }

    }
}
