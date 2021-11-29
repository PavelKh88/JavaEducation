package com.rusin.StringExerсise;

import java.util.logging.SocketHandler;

public class Exercise_19 {
    public static void main(String[] args) {
        String str = new String("I want to become a programmer");
      String st =  str.replaceAll("\\s+","");
        System.out.println(st);
        char[] array = st.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "1");

        }


    }
}
