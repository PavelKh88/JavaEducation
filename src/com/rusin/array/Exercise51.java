package com.rusin.array;

public class Exercise51 {
    public static void main(String[] args) {
        int[] array = new int[] {-4, 5, -22, -1, 45, -99, -98, -55, 5, 43, 7, 64, 77, 107};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                if(array[i] % 2 == 0)count++;
            }

        }
        System.out.println("How many negative numbers divide by 2 without a remainder = " + count);
    }
}
