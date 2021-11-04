package com.rusin.array;

public class Exercise33char {
    public static void main(String[] args) {
        String str1 = "java - is the best";
        char ch = 0;
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c == ' ')count++;
            System.out.println(" index " + i + " is " + c);
        }
        String a = "java";
        System.out.println(a);
    }
}
