package com.rusin.loops;
//1 1 1 1 1 1
//1 1 1 1 1 1
//1 1 0 0 1 1
//1 1 0 0 1 1
//1 1 1 1 1 1
//1 1 1 1 1 1
public class Exercise25While_7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 6){
            while (b <= 6){
                if((a == 3 || a == 4) && (b == 3 || b ==4) ){
                    System.out.print(" 0 ");
                }
                else {
                    System.out.print(" 1 ");
                }
                b++;
            }
            a++;b = 1;
            System.out.println();
        }
    }
}
