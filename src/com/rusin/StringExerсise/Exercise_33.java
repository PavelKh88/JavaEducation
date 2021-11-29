package com.rusin.StringExerсise;

public class Exercise_33 {
    public static void main(String[] args) {
        String str = ("A cat has nine lives");
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'a' ||array[i] == 'e' ||array[i] == 'i' ||array[i] == 'o' ||array[i] == 'u' ||array[i] =='y'){
                stringBuilder.append(array[i]);
            }
        }
        System.out.println(stringBuilder);
    }
}
