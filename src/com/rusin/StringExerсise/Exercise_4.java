package com.rusin.StringExerсise;

public class Exercise_4 {
    public static void main(String[] args) {
        String str = new String("A hungry wolf is stronger than a satisf ied dog");
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length() ; i++) {
            if(array [i] == 'a'){
                count++;
            }
        }
            System.out.println(count);
    }
}
