package com.rusin;
import java.util.Scanner;
public class abvariable {

    public static void main (String[] args)
            throws java.io.IOException
    {
        Scanner scanner=new Scanner(System.in);


        System.out.println("enter variable a");
        int a = scanner.nextInt();
        System.out.println("enter variable b");
        int b=scanner.nextInt();
        System.out.println("Result:");
        if (a<b)System.out.println("a less than b");
        if (a>b)System.out.println("a more than b");
        if(a==b)System.out.println("a aqual to b");





    }


}
