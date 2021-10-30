package com.rusin.loops;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int num = in.nextInt();

        String numString=String.valueOf(num);
        char first = numString.charAt(0);
        char last = numString.charAt(numString.length()-1);
        System.out.println("first digit "+ first +" last digit " + last );
       int a = Character.getNumericValue(first);
       int z = Character.getNumericValue(last);

       int result = a + z ;
        System.out.println("Sum first + last =" + result);

        //при введении числа 00089 программа видит первым числом 8  и 9 вторым .



    }
}
