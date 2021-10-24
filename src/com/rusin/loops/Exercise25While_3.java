package com.rusin.loops;
//0 1 0 1 0 1
//0 1 0 1 0 1
//0 1 0 1 0 1
//0 1 0 1 0 1
//0 1 0 1 0 1
//0 1 0 1 0 1
public class Exercise25While_3 {
    public static void main(String[] args) {
    int a = 1;
    int b = 1;
    while(a <= 6){
        while(b <= 6){
            if(b % 2 != 0){
                System.out.print(" 0 ");
            }
            else{
                System.out.print(" 1 ");
            }
            b++;
        }
        System.out.println();
        a++;
        b = 1;
    }

    }
}
