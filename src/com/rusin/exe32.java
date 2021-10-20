package com.rusin;

public class exe32 {
    public static void main(String args[]){

        int a=4;
        int b=5;
        int c=6;

        double p=(double)(a+b+c)/2;
        System.out.println(p);

        double s =(double)Math.sqrt( p*((p-a)*(p-b)*(p-c)));
        System.out.println(s);

    }
}
