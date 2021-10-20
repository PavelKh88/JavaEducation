package com.rusin.loops;

public class Exercise25_7 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
         if(i != 0 && i != 1 && i != 4 && i !=5 ) {
             for (int j = 0; j < 6; j++) {
                 if (j != 2 && j != 3) {
                     System.out.print(" 1");
                 } else {
                     System.out.print(" 0");
                 }
             }
         }
         else{
             for (int j = 0; j < 6; j++) {
                 System.out.print(" 1");
             }
         }
            System.out.println();
        }
    }
}
