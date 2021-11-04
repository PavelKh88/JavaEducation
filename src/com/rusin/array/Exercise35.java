package com.rusin.array;

public class Exercise35 {
    public static void main(String[] args) {
        int[] array = new int[] {234, 3457, 657, 456, 89, 234, 2, 45243, 5, 423, 23, 5, 423, 52};
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) count1++;
            if (array[i] % 2 != 0) count2++;
        }
        System.out.println("Event elements");
        System.out.println(count1);
        System.out.println("Odds elements");
        System.out.println(count2);
    }
}
