package com.rusin.loops;
// * *
// * *
// * *
// * *
// * *
public class Exercise10While4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        while (a <= 5){
            while(b <= 2){
                System.out.print(" * ");
                b++;
            }
            System.out.println();
            a++;
            b = 1;

        }
    }
}
