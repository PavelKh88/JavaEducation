package com.rusin.loops;

import java.util.Scanner;

public class Exersice14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the intedger");
        int num = in.nextInt();

        String numString = String.valueOf(num);
        char first = numString.charAt(0);
        char last = numString.charAt(numString.length()-1);

        System.out.println("First simbol " + first + "  Last simbol " + last );
    }
}
