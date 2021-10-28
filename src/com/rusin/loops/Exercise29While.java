package com.rusin.loops;

public class Exercise29While {
    public static void main(String[] args) {
        int count2 = 11;
        int count1 = 1;
        for (int i = 1; i <= 11 ; i++) {
            for (int j = 1; j <= 11 ; j++) {
                if (j == 11 || j == 1 || i == 1 || i == 11 || j == count1 || j == count2){
                    System.out.print("*");
                }

               else{
                   if(j == 11 || j ==1)continue;
                   System.out.print(" ");
               }

            }
            System.out.println();
            count1++;count2--;
        }

    }
}
