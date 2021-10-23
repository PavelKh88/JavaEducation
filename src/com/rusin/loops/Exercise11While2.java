package com.rusin.loops;

public class Exercise11While2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        while (a <= 3){
            while (b <= c){
                System.out.print(" * ");
                b++;
            }
            a++;c++;
            b = 1;
            System.out.println();
        }
    }
}
