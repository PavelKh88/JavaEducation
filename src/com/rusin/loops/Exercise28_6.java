package com.rusin.loops;

public class Exercise28_6 {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j < b ; j++) {
                System.out.print("#");

                               }
            for (int j = 0; j <1 ; j++) {
                System.out.print(a);
                a--;
            }
                b--;

            System.out.println();
        }

    }
}
