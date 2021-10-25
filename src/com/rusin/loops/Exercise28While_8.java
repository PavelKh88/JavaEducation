package com.rusin.loops;

public class Exercise28While_8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int count1 = 1;
        int count2 = 9;
        while(a <= 9){
            while(b <= 9){

                if(count1 == b){
                    System.out.print(count2);
                    if(count2 == 5){
                        break;}
                }
                if(count2 == b){
                    System.out.print(count2);

                }
                else{
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println();
            a++;count1++;count2--;b = 1;
        }
    }
}
