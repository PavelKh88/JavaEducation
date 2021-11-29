package com.rusin.StringExerсise;

public class Exercise_19_1 {
    public static void main(String[] args) {
        String str = new String("I want to become a programmer");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == ' ') {
                System.out.print(" ");
            }
            else{
                System.out.print(array[i] + "1");
            }
        }


    }
}


