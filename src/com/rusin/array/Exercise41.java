package com.rusin.array;

public class Exercise41 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 5, 6, 3, 2, 5, 7, 8};
        int multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        System.out.println("all value in array multiplication = " + multi);
    }
}
