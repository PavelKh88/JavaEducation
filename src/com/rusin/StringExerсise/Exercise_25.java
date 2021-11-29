package com.rusin.StringExerсise;

public class Exercise_25 {
    public static void main(String[] args) {
        String str = new String("wejhbnpolkdshjnjwe");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length ; i++) {
            if(i % 2 == 0){
                stringBuilder.append(array[i]);
            }
            else{
                stringBuilder1.append(array[i]);
            }
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
    }
}
