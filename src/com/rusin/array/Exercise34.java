package com.rusin.array;

public class Exercise34 {
    public static void main(String[] args) {
        char[] array = new char[] {'d' , 'f', '3', '1' , 'y', 'r', 'i', 'y', 'y', 'u'};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'y') count++;
        }
        System.out.println(count);
    }
}
