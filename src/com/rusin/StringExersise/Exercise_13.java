package com.rusin.StringExersise;

public class Exercise_13 {
    public static void main(String[] args) {
        String str = new String("iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj");
        char[] array = str.toCharArray();
        int count = 0;
        System.out.println("iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj");
        for (char c : array) {
            if(c == '0' || c == '1' || c == '2'|| c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
                count++;
                System.out.print(c);
            }

        }
        System.out.println();
        System.out.println(count);

    }
}
