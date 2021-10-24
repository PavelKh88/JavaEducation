package com.rusin.loops;
//1 1 1 1 1 1
//1 0 0 0 0 1
//1 0 0 0 0 1
//1 0 0 0 0 1
//1 0 0 0 0 1
//1 1 1 1 1 1

public class Exercise25While_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 6){
            while(b <=6){
                if(a != 1 && a != 6 && (b == 2 || b == 3 || b == 4 || b == 5)){
                    System.out.print(" 0 ");
                }
                    else {
                    System.out.print(" 1 ");
                }
                b++;
            }
            System.out.println();
            a++;b = 1;

        }
    }
}
