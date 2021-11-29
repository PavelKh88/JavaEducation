package com.rusin.StringExerсise;

public class Exercise_21 {
    public static void main(String[] args) {
        String str = new String("A bird in hand is worth two in the bush");
        char[] array = str.toCharArray();
        for (char c : array) {

            if(c == ' ') System.out.print('.' + " ");
            else{
                System.out.print(c);
            }
        }

    }

}
