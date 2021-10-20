package com.rusin;
//exercise #23

public class dayofweek {
    public static void main(String[] args)
            throws java.io.IOException{

        System.out.println("Select the number of the day of the week:");
        System.out.println("1.\t2.\t3.\t4.\t5.\t6.\t7.");
        char a=(char) System.in.read();
        switch (a){
            case '1':
                System.out.println("monday");
                break;
            case '2':
                System.out.println("tuesday");
                break;
            case '3':
                System.out.println("wednesday");
                break;
            case '4':
                System.out.println("thursday");
                break;
            case '5':
                System.out.println("friday");
                break;
            case '6':
                System.out.println("saturday");
                break;
            case '7':
                System.out.println("sunday");

                break;


        }





    }
}
