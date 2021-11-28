package com.rusin.StringExersise;

public class Exercise_10 {
    public static void main(String[] args) {
        String str = new String("Keep fire away from straw");
        char[] array = str.toCharArray();
        int sum = 0;
        for (char c : array) {
            System.out.println(c + " =>" + (int) c);
            sum += (int) c ;
        }
        System.out.println(sum);
    }

}
