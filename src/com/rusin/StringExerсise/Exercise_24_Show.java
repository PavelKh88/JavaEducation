package com.rusin.StringExerсise;

public class Exercise_24_Show {
    public static void main(String[] args) {
        String str = new String("I was really too honest a man to be a politician and live");
        char[] array = str.toCharArray();
        int count = 0;
        char a = ' ';
        for (int i = 1; i < array.length; i++) {
            count++;
            if(array[i] == ' '){
                count = 0;
            }
            if(count == 1){
                a = array[i];
            }
            if(count == 2){
                array[i - 1] = array[i];
                array[i] = a;
            }
        }
        System.out.println(array);
    }
}
