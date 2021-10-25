package com.rusin.loops;

public class Exercise29While {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int count = 1;
        int count1 = 11;
        while (a <= 11){
            while (b <= 11){
                if(count == b && a != 1 && a != 11){
                    System.out.print("@");
                }
                if(count1 == b && a != 1 && a != 11){
                    System.out.print("$");
                }
                if(a == 1 || a == 11 || b ==1 || b == 11 ){
                    System.out.print("&");
                }
             else {
                System.out.print("#");
                }
             b++;
            }
            System.out.println();
            a++;b = 1;count++;count1--;
        }
    }
}
