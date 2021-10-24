package com.rusin.loops;
//1 2 3 4 5 6
//2 3 4 5 6 6
//3 4 5 6 6 6
//4 5 6 6 6 6
//5 6 6 6 6 6
//6 6 6 6 6 6
public class Exercise25While_9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 6){
            int count = a;
            while (b <= 6){
                if (count >= 6) System.out.print(" 6 ");
                else{
                    System.out.print(" " + count + " ");
                }
                count++;
                b++;
            }
            System.out.println();
            a++;b = 1;
        }
    }
}
