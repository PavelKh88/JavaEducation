package com.rusin.array;

public class Exercise52 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 15, 17, 45, 23, 5, 47, 543, 234, 5345, 23, 1};
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] >= 16 && array[i] <= 300) count++;

        }
        int[] array1 = new  int[count];
        int count2 = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] >= 16 && array[i] <= 300){array1 [count2] = array[i];count2++;}
        }
        for (int g:array1)
        {
            System.out.println(g);
        }
    }
}
