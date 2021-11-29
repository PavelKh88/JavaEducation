package com.rusin.StringExerсise;

public class Exercise_30 {
    public static void main(String[] args) {
    String str =("Drunkards know no danger");
    char[] array = str.toCharArray();
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == ' ') {
               array[i - 1] = Character.toUpperCase(array[i - 1]);
               array[i + 1] = Character.toUpperCase(array[i + 1]);
            }
            array[array.length - 1] = Character.toUpperCase(array[array.length -1]);
        }
        System.out.println(array);
   }
}
