package com.rusin.loops;
//*
//* *
public class Exercise11While1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        while (a <= 2){
            while (b <= c ){
                System.out.print(" * ");
                b++;
            }
            b = 1;
            a++;c++;
            System.out.println();
        }
    }
}
