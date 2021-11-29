package com.rusin.StringExerсise;

public class Exercise_18 {
    public static void main(String[] args) {
        String str = new String("Anna");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array [i];
            if (Character.isLowerCase(c)) {
                array [i] = Character.toUpperCase(c);
            }
            }
            if(array[0] == array[array.length-1]) System.out.println(str + " a palindrome");
            else {
                System.out.println(str + " not a palindrome");
        }
        System.out.println(new String(array));
        }
    }

