package com.rusin.loops;

public class Exercise28_7 {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 9 ; j++) {
                if(j == 0 || j == 8) System.out.print("1");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int j = 0; j < 9 ; j++) {
                if(j == 1 || j == 7) System.out.print("2");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int k = 0; k < 9 ; k++) {
                if (k == 2 || k == 7) System.out.print("3");
                else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            for (int j = 0; j < 9; j++) {
                if (j == 3 || j == 6) System.out.print("4");
                else {
                    System.out.print(" ");
                }
               }
                System.out.println();

            for (int j = 0; j < 9 ; j++) {
                if(j == 4) System.out.print(" 5");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if(j == 3 || j == 6) System.out.print("6");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if(j == 2 || j == 7) System.out.print("7");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if(j == 1 || j == 8) System.out.print("8");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if(j == 0 || j == 8) System.out.print("9");
                else {
                    System.out.print(" ");
                }

            }
        }
    }
}
