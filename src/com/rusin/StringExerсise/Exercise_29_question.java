package com.rusin.StringExerсise;

public class Exercise_29_question {
    public static void main(String[] args) {
        String str = ("Fire begins with sparks");
        char[] array = str.toCharArray();
        int count =1;
        for (int i = 0; i < array.length; i++) {
           char c =array[i];///////////////////////////////////////Почему так?
            if(array[i] == ' '){
                count = 0;
            }
            if(count == 1){
               array[i] = Character.toUpperCase(c);
            }
            count++;
        }
        System.out.println(array);

    }
}
