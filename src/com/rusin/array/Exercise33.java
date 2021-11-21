package com.rusin.array;

public class Exercise33 {
    public static void main(String[] args) {
        char[] array = new char[] {'4', '1', 'a', 'n', 'y', 'p', '1', '9', 'p'};
        int count = 0;
        for (char c : array) {
            if(Character.isDigit(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
