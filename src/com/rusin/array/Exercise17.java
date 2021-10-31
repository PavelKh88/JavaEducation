package com.rusin.array;

public class Exercise17 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 7, 4, 4, 3, 2, 78, 45, -4, -3, 22, -100, 0, 12};
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 == 0)count++;
        }
        int[] array2 = new int[count];
        int count1 = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 == 0){
                array2[count1] = array[i];
                System.out.println(array2[count1]);
                count1++;
            }
        }
    }
}
