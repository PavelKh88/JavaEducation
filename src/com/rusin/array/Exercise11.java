package com.rusin.array;

public class Exercise11 {
    public static void main(String[] args) {
        int[] array = new int[] {2,4,5,10,0,-1,0,-3,6,3,2,1,3};
        int a = 5, b = 0, c = 3;
        for (int i = 0; i <= array.length; i++) {

          if(array [i] == a) System.out.println("element array " + i + " is aqual to 5" );
           if(array [i] == b) System.out.println("element array " + i + " is aqual to 0");
          if(array [i] == c) System.out.println("element array "+ i + " is aqual to 3");
          else  System.out.println("value is undefined");
        }
    }
}
