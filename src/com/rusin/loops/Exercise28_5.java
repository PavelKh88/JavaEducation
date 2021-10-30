package com.rusin.loops;

public class Exercise28_5 {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j <= b ; j++) {
                System.out.print("#");
            }
            System.out.println(a);
            a--;
            b++;
        }
    }
}
