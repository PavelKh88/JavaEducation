package com.rusin.array;

public class Exercise16 {
    public static void main(String[] args) {
        int[] array = new int[] {6, -6, 3, 2, 1, 67, 555, 45, 23, 76, 33, 11, -678};

        int a = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 == 0){
               a++;
            }
        }
        int[] array2 = new int[a];
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                array2 [b] = array[i];
                System.out.println(array2[b]);
                b++;
            }
        }

    }
}
