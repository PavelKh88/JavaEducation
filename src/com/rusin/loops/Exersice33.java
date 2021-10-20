package com.rusin.loops;

public class Exersice33 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10 ; i++) {
          result = i * i *i;
            System.out.print(" " + result + " ");
        }
        System.out.println();
        for (int i = 10; i >=1 ; i--) {
            result = i * i * i;
            System.out.print(" " + result + " ");
        }
    }
}
