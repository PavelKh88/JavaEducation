package com.rusin.array;

public class Exercise58 {
    public static void main(String[] args) {
        int[] array1 = new int[] {6, 4, 3, 9, 10, 12, -45};
        int[] array2 = new int[] {7, 4, 5, 0, -39, 23};
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] == 5) System.out.println("array1 have value 5 in index " + i);
        }
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] == 5) System.out.println("array2 have value 5 in index " + i);

        }
    }
}
