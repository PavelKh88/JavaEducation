package com.rusin.StringExerсise;

public class Exercise_12 {
    public static void main(String[] args) {
        String str = new String("No matter how hard you try the bull will never give milk");
        String[] array = str.split("\\W+");
        String low = array[0];
        String max = array[1];

        for (String s : array) {
            if(s.length() < low.length()) low = s ;
            if(s.length() > max.length()) max = s ;

            System.out.println(s);
            System.out.println(s.length());
        }
        System.out.println( "MAX = " + max);
        System.out.println("Min = " + low);
    }
}
