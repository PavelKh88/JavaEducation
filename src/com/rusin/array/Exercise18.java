package com.rusin.array;

public class Exercise18 {
    public static void main(String[] args) {
        int[] array = new int[] {7, 5, 4, 6, 12, 45, 98, -10};
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 != 0)count++;
        }
        int[] array2 = new int[count];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array2[count2] = array[i];
                System.out.println(array2[count2]);
                count2++;
            }
        }
    }
}
