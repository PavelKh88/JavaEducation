package com.rusin.loops;

public class Exercise38 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= a; j++) {
               if(j == b){
                   System.out.print("1");
               }
               else{
                   System.out.print("8");
                }

            }
            a--;b--;
            System.out.println();
        }
    }
}
