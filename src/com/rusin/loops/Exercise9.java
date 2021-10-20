package com.rusin.loops;

public class Exercise9 {
    public static void main(String[] args) {

        int a = 18;
        int result;
        for (int i = 1; i <= 18 ; i++) {
            result = a % i;
            if(result == 0) System.out.println(i);

        }
    }
}
