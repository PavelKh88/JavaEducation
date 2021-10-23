package com.rusin.loops;
// * * * * *
//  * * * * *
// * * * * *
//  * * * * *
// * * * * *
public class Exercise10While6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while(a <= 5) {
            if(a % 2 != 0) System.out.print(" ");
            while (b <= 5){
                System.out.print(" * ");
                b++;
            }

            System.out.println();
            b = 1;
            a++;

        }
    }
}
