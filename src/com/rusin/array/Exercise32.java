package com.rusin.array;

public class Exercise32 {
    public static void main(String[] args) {
        double[] array = new double[] {5, 7, 8, 5, 3, 6, 8};
        double[] array2 = new double[] {67, 43, 2, 3, 4444, 3, 22};
       double a = 0;
        System.out.println(" operation - ");

        for (int i = 0; i < array.length; i++) {
            a = array[i] - array2[i];


            System.out.print( (int)a + " ");
        }
        System.out.println();
        System.out.println(" operation + ");
        for (int i = 0; i < array.length; i++) {
            a = array[i] + array2[i];
            System.out.print((int)a + " " );
        }
        System.out.println();
        System.out.println(" operation * ");
        for (int i = 0; i < array.length; i++) {
            a = array[i] * array2[i];
            System.out.print((int)a + " ");
        }
        System.out.println();
        System.out.println(" operation / ");
        double b;
        for (int i = 0; i < array.length; i++) {
            a = array[i] / array2[i];
            b = (double) Math.round(a * 100) / 100;
            System.out.print( b + "   ");
        }
    }
}
