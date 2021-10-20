package com.rusin.loops;

public class Exersice25_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <6 ; j++) {
               if(j == 1 || j == 4){
                System.out.print(" 0");}
               else{
                   System.out.print(" 1");
               }
            }
            System.out.println();
        }
    }
}
