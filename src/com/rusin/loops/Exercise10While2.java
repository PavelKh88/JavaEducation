package com.rusin.loops;

import javafx.beans.binding.When;

//* * * * *
//* * * * *

public class Exercise10While2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 2){
            while (b<=5){
                System.out.print(" * ");
                b++;
            }
            a++;
            System.out.println();
            b = 1;
        }
    }
}

