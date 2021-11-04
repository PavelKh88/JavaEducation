package com.rusin.array;

public class Exercise26 {
    public static void main(String[] args) {
        double a = Math.random() * 50;
        int[] array = new int[(int)a];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        for (int i:array)
              {
                  System.out.println(i);
        }
    }

}
