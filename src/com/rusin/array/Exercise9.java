package com.rusin.array;

public class Exercise9 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < 12 ; i++) {
            if(i < 4) array[i] = 1;
            if(i >= 4 && i < 8) array[i] = 2;
           if(i >=8 && i < 12) array[i] = 3;
            System.out.println(array[i]);
        }
    }
}
