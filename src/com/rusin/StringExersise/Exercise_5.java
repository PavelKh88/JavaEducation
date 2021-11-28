package com.rusin.StringExersise;

public class Exercise_5 {
    public static void main(String[] args) {
        String str = new String("Borrowed bread lies heavy on the stomach");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length ; i++) {
            System.out.print( "'" + array[i] + "'");
        }
    }
}
