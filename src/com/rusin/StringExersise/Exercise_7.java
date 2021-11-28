package com.rusin.StringExersise;

public class Exercise_7 {
    public static void main(String[] args) {
        String str = new String("Fools love not the wise, drunkards love not the sober");
        char[] array = str.toCharArray();
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            index++;
            if(array[i] == 'o'){
                System.out.println("Index 'o' = " + index);
            }
        }
    }
}
