package com.rusin.array;

public class Exercise14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int a = 7;
        int b = 1;
        for (int i = 0; i < array.length ; i++) {
            if(i <= 7) {
                array[i] = a;
                a--;
            }
            else {
                array[i] = b;b++;
            }
            System.out.println(array[i]);
        }
    }
}
