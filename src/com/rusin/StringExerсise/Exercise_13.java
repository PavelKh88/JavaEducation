package com.rusin.StringExerсise;

public class Exercise_13 {
    public static void main(String[] args) {
        String str = new String("iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj");
        char[] array = str.toCharArray();
        int count = 0;
        System.out.println("iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj");
        for (char c : array) {
            if(Character.isDigit(c)){
                count++;
                System.out.print(c);
            }
                        ////
        }
        System.out.println();
        System.out.println(count);

    }
}
