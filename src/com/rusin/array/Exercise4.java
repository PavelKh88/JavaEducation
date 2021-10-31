package com.rusin.array;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < 5 ; i++) {
            array[i] = i + 5 + i;
        }
        for (int i:array)
              {
                  System.out.println(i);
        }
    }
}
