package com.rusin.array;

public class Exercise24 {
    public static void main(String[] args) {
        String[][] array = new String[][] {{"Hello", " world!", " I", "'m"}, {"a"," programmer"} };
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        String[] array2 = new String[count];
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array2[count1] = array[i][j];
                count1++;
            }
        }
        for (int i = 0; i < array2.length ; i++) {
            System.out.print(array2[i]);
        }


    }
}
