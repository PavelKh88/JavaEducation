package com.rusin.array;

public class Exercise33 {
    public static void main(String[] args) {
        char[] array = new char[] {'4', '1', 'a', 'n', 'y', 'p', '1', '9', 'p'};
       int count = 0;
       int count2 = 0;
       int result = 0;
        for (int i = 0; i < array.length; i++) {
            //  char c = array.charAt(i);
            if(array[i] == '4' || array[i] == '1' || array[i] == '9' ){ count++;}
            count2++;

        }
        result =count2 - count ;
        System.out.println(result);
    }
}
