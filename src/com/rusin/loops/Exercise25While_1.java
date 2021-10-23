package com.rusin.loops;
//1 1 1 1 1 1
//1 1 1 1 1 1
//1 1 1 1 1 1
//1 1 1 1 1 1
//1 1 1 1 1 1
//1 1 1 1 1 1
public class Exercise25While_1 {
    public static void main(String[] args) {
    int a = 1;
    int b = 1;
    while(a <= 6) {
        while (b <= 6){
            System.out.print(" " + 1 + " " );
            b++;
        }
        b = 1;
        System.out.println();
        a++;
        }

    }
}
