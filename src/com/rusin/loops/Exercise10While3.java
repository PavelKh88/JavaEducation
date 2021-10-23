package com.rusin.loops;
// *
// *
// *
// *
// *
public class Exercise10While3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 5){
            while (b <= 1){
                System.out.print(" * ");
                b++;
            }
            System.out.println();
            b = 1;
            a++;
        }

    }
}
