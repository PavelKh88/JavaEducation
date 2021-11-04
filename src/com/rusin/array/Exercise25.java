package com.rusin.array;

public class Exercise25 {
    public static void main(String[] args) {
        int[] array = new int[15];
       // int a = (int) (Math.random()*5);
        for (int i = 0; i < array.length; i++) {
            int a = (int) (Math.random() * 15);
            array[i] = a;

        }
        for (int i:array)
              {
                  System.out.println(i);
        }
    }

}
