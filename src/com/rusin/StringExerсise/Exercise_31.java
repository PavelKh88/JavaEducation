package com.rusin.StringExerсise;

public class Exercise_31 {
    public static void main(String[] args) {
        String str = ("Black souls wear white shirts");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == ' ') {
                array[i - 2] = Character.toUpperCase(array[i - 1]);
                array[i + 2] = Character.toUpperCase(array[i + 1]);
            }
            array[array.length - 2] = Character.toUpperCase(array[array.length -2]);
            array[1] = Character.toUpperCase(array[1]);
        }
        System.out.println(array);
    }
}
