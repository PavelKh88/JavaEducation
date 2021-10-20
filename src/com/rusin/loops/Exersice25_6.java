package com.rusin.loops;

public class Exersice25_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

           if(i != 2 && i != 3 ){
               for (int j = 0; j < 6; j++) {
                        if(j ==2 || j ==3){
                        System.out.print(" 0");
                        }

                        else{
                            System.out.print(" 1");
                        }

                        }
                        System.out.println();}
           else{
               for (int j = 0; j < 6 ; j++) {
                   System.out.print(" 0");


               }
               System.out.println();
           }
        }
    }
}
