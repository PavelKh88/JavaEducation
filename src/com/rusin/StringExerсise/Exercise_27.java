package com.rusin.StringExerсise;

public class Exercise_27 {
    public static void main(String[] args) {
        String str = new String("Laziness is your best friend. Never do twice what you can automate once");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == ' '){
                array[i] = '-';
            }
        }
        System.out.println(array);
    }
}
