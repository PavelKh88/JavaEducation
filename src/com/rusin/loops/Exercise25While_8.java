package com.rusin.loops;
// 1 2 3 4 5 6
// 2 3 4 5 6 7
// 3 4 5 6 7 8
// 4 5 6 7 8 9
// 5 6 7 8 9 10
// 6 7 8 9 10 11
public class Exercise25While_8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        while(a <= 6){
            int c = a;
            while(b <=6){
                System.out.print(" " + c + " ");
                b++;c++;


            }
            System.out.println();


            a++;b = 1;
        }
    }
}
