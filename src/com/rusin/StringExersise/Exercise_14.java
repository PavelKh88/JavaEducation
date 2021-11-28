package com.rusin.StringExersise;

public class Exercise_14 {
    public static void main(String[] args) {
        String str = new String("sdgHjhgJHGHJggSLsjLKSkjhkjhSjhkSkhsk");
        char[] array = str.toCharArray();
        int count = 0;
        for (char c : array) {
            if(c >= 'A'&& c <= 'Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
