package com.rusin.loops;

import java.beans.PropertyEditorSupport;

public class Exercise5While {
    public static void main(String[] args) {
        int b = 1;
        int a = 200 ;
        int result = 0;

        while (result >= 0 ){

            result = a - b ;
            System.out.println("b " + b);
            System.out.println(" result " + result);
            b++;



        }
    }
}
