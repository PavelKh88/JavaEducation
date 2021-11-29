package com.rusin.StringExerсise;

public class Exercise_36_question {
    public static void main(String[] args) {
        String str = ("Always put your best foot forward");
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]){
                continue;
            }
            stringBuilder.append(array[i]);////So not to do it????
        }
        System.out.println(str);
        System.out.println(stringBuilder);
    }
}
