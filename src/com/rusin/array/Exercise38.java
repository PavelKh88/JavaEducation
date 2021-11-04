package com.rusin.array;

public class Exercise38 {
    public static void main(String[] args) {
        int[] array = new int[] {6, 54, 5, 34, 43, 54, -9, 54, 3, 54, 5, 3456, 3, 5, 4, 3};
        int min;
        int max;
        int count = 0;
        int count2 = 0;
        min = max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            count++;
            if(array[i] == min) break;
        }
        for (int i = 0; i < array.length ; i++) {
            count2++;
            if(array[i] == max)break;
        }

        System.out.println("min value: " + min);
        System.out.println("max value: " + max);
     //   System.out.println(count + "   " + count2); index
        for (int i = count ; i < count2 - 1; i++) {
            System.out.print(array[i] + "," );
        }

    }
}
