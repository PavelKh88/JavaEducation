package com.rusin.loops;
//1 1 1 1 1 1
//0 0 0 0 0 0
//1 1 1 1 1 1
//0 0 0 0 0 0
//1 1 1 1 1 1
//0 0 0 0 0 0
public class Exercise25While_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 6){
            while(b<=6){
                if(a % 2 != 0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
                b++;
            }
            a++;
            b = 1;
            System.out.println();
        }
    }
}
