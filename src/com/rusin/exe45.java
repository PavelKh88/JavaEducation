package com.rusin;

public class exe45 {
    public static void main(String agrs []){

        double a=Math.sqrt(6.3*1.7);
        double b=((6.3/1.7)-(1.7/6.3))*a;  //up variable
        System.out.println(b);
//////////////////////////////////////////////////
        double c=Math.sqrt ((6.3+1.7)*(6.3+1.7)-(4*6.3*1.7));
        System.out.println(c);
        double result=b/c;
        System.out.println(result);

    }
}
