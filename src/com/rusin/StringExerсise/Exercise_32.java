package com.rusin.StringExerсise;

public class Exercise_32 {
    public static void main(String[] args) {
        String str = ("Absence makes the heart grow fonder");
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
           if(i % 2 == 0){
               stringBuilder.append(array[i]);
           }
        }
        System.out.println(stringBuilder);
    }
}
