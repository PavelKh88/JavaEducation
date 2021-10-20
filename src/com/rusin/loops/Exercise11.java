package com.rusin.loops;

public class Exercise11 {
    public static void main(String[] args) {
        int f = 0 ;
        for (int i = 0; i < 5 ; i++) {                  //Число строк
                f++;
            for (int j = 1; j <= f ; j++) {            //Инкремент точек
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
