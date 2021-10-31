package com.rusin.array;

public class Exercise13 {
    public static void main(String[] args) {

        int[] array = new int[] {8,4,6,2,43,2,-6,0,5,4,-32,12};
        for (int i = array.length - 3; i >= 0 ; i -= 3) {
            System.out.println(array[i]);
        }
    }
}
