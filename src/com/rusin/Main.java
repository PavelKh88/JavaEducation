package com.rusin;

import   java.util.Random;
public class Main {

    public static void main(String[] args)
            throws java.io.IOException {

        int min = 0;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);
        if(i>5) System.out.println("Yes");
        else System.out.println("No");




        }



    }









