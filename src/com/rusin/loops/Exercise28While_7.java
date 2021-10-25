package com.rusin.loops;

public class Exercise28While_7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int count1 = 1;
        int count2 = 9;
        while( a<=9 ){
            while( b<=9 ){
               if( count2 == b ){
                   System.out.print(count1);
               }
                if( count1 == b ){
                    if(count1 == 5){
                        break;
                    }
                   System.out.print(count1);
               }
               else{
                   System.out.print(" ");
               }
                b++;
            }
            a++;count1++;count2--;b = 1;
            System.out.println();

        }
    }
}
