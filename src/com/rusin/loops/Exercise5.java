package com.rusin.loops;

public class Exercise5 {
    public static void main(String[] args) {

        int b = 200;
        int a = 1;
        while (b >= 0) {
            b -= a;
            a++;

        }
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
