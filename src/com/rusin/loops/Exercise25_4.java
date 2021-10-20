package com.rusin.loops;

public class Exercise25_4 {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {


           if(i !=0 && i !=5) for (int j = 0; j <6 ; j++) {

                if(j != 0 && j !=5) System.out.print("0 ");
                else {System.out.print("1 ");}
            }
            else{
               for (int j = 0; j <6 ; j++) {
                   System.out.print("1 ");
               }

           }

           System.out.println();

        }
    }
}
