package com.rusin.array;

public class Exercise20v2 {
    public static void main(String[] args) {
        int[] array = new int[] {6, 34, 234, 65, 0, -54, -3, 6, 3, 5};
        int[] array2 = new int[] {6, 4, 3, 6, 4, -4};
        int[] array3 = new int [array.length + array2.length];
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            array3[count] = array[i];count++;
          if(i < array2.length) {
              array3[count] = array2[i];count++;
          }

        }
        for (int i:array3)
        {
            System.out.println(i);
        }
    }
}
