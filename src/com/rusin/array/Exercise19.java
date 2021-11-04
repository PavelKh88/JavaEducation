package com.rusin.array;

public class Exercise19 {
    public static void main(String[] args) {
        int[] array = new int[] {7, 3, -4, -1, 0, 4, 75, -90};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)count++;
        }
        int[] array2 = new int[count];
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                array2[count1] = array[i];
                System.out.println(array2[count1]);
                count1++;
            }
        }
    }
}


