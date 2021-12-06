package com.rusin.StringExerсise;

public class Exercise_39_problem {
    public static void main(String[] args) {
        String str =("Facebook wasn't built in a day");
        String [] array = str.split(" ");
        String str1 = " ";
        for (int i = 0; i < array.length ; i++) {
            if(array[i].length() >= str1.length()){
                str1 = array[i];
            }
        }
        System.out.println(str1);
        System.out.println(str1.length());
        char[] array2 = str1.toCharArray();// Why is the whole array here
        for (int i = 0; i < array2.length; i++) {

            System.out.print((int) array2[i] + " ");
        }
    }

}
