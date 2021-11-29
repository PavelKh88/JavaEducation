package com.rusin.StringExerсise;

public class Exercise_21_1 {
    public static void main(String[] args) {
        String str = new String("A bird in hand is worth two in the bush");
        char[] array = str.toCharArray();
        String str1 = new String();
        for (char c : array) {

            if(c == ' ') { str1 += '.' + " ";

            }
            else{
                str1 += c;
            }
        }
        str1 += '.';
        System.out.print(str1);

    }

}
