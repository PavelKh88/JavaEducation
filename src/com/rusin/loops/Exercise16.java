package com.rusin.loops;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int num = in.nextInt();
        char [] arr = String.valueOf(num).toCharArray();
        int result = 1;
        for (char anArr : arr ){
            result*=(anArr-'0');


        }
        System.out.println(result);
    }
}
