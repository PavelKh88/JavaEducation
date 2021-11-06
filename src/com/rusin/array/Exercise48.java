package com.rusin.array;

public class Exercise48 {
    public static void main(String[] args) {
        int[] array = new int[] {234, 4, 5, 7, 4, 5, 3, 7, 9, 5};
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 == 0) count++;
        }
        int [] array2 = new int[count];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                array2[count2] = array[i];count2++;

            }
        }
        for (int h:array2)
        {
            System.out.println(h);
        }
    }
}
