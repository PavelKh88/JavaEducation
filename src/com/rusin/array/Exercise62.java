package com.rusin.array;

public class Exercise62 {
    public static void main(String[] args) {
        int[] array = new int[] {123, 4, -4, 5, -5, -999, -7, -11, -775, -77, -43, -45, 67, 999, 234, 173, 761};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                if(array[i] / - 5 == 1)count++;
            }
        }
        System.out.println(count);



    }
}
