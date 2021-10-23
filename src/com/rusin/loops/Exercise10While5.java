package com.rusin.loops;
// * *
// * *
public class Exercise10While5 {
    public static void main(String[] args) {
        int a = 1 ;
        int b = 1 ;
        while (a <= 2){
            while (b <= 2){
                System.out.print(" * ");
                b++;
            }
            System.out.println();
            a++;
            b = 1;
        }
    }
}
