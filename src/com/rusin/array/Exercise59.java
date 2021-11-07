package com.rusin.array;

public class Exercise59 {
    public static void main(String[] args) {
        int[] array1 = new int[] {5, 7, 5, 55, 4, 0, -9};
        int[] array2 = new int[] { -10, 44, 55, 3, -54, 45};
        for (int i = 0; i < array1.length ; i++) {
            if(array1[i] == 45) System.out.println("array1 have value 45 in index " + i);
            if(array1[i] == 55) System.out.println("array1 have value 55 in index " + i);
        }
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] == 45) System.out.println("array2 have value 45 in index " + i);
            if(array2[i] == 55) System.out.println("array2 have value 55 in index " + i);
        }
    }
}
