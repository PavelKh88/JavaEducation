package com.rusin.array;

public class Exercise28 {
    public static void main(String[] args) {
        int[][] array = new int[][] {{6, 5, 7, -5, 4, 6, 5, 0, 5, 6, 7},{0, 3, 5, 4, 2, 4, -6, -100, 8},{5, 4, 6, -5, 4, 3, 1}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
                if(array[i][j] == 0)break;
            }
            System.out.println();
        }
    }
}
