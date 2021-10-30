package com.rusin.loops;

public class Exercise28_4 {
    public static void main(String[] args) {
            int a = 8;
        for (int i = 1; i <10 ; i++) {
            for (int j = a; j >=1 ; j--) {
                System.out.print(" ");
            }
            a--;
            System.out.println(i);
        }
    }
}
