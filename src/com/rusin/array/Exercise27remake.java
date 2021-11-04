package com.rusin.array;

public class Exercise27remake {
    public static void main(String[] args) {
        int a = 111;
        int b = a % 2;
        int c = ( a - b ) / 2;
        int d = c % 2;
        int i = ( c - d ) / 2;
        int f = i % 2;
        int g = ( i - f) / 2;


        System.out.println(" variable b = " + b);
        System.out.println(" variable c = " + c);
        System.out.println(" variable d = " + d);
        System.out.println(" variable i = " + i);
        System.out.println(" variable f = " + f);
        System.out.println(" variable g = " + g);
    }
}
