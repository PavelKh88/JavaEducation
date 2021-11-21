package com.rusin.array;

public class Exercise58 {
    public static void main(String[] args) {
        int[] array1 = new int[] {506, 4, 3, 9, 105, 12, -465};
        int[] array2 = new int[] {7, 4, 15, 0, -395, 23};
        for (int number : array1) {
            while (number != 0) {
               if (number % 10 == 5 ) {
                   System.out.println(" yes ");
                   return;
               }
               number /= 10;
            }

        }
    }
}
