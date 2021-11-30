package com.rusin.StringExerсise;

public class Exercise_38 {
    public static void main(String[] args) {
        String str = ("performance");
        char[] array = str.toCharArray();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'f') index = i ;
        }
        System.out.println("Index begin substring <for> is " + index);
    }
}
