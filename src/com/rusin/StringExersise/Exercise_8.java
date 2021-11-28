package com.rusin.StringExersise;

public class Exercise_8 {
    public static void main(String[] args) {
        String str = new String("All programming is maintenance programming, because you are rarely writing original code.");
        char[] array = str.toCharArray();
        int count = 1;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == ' ')count++;
        }
        System.out.println(count);
    }

}
