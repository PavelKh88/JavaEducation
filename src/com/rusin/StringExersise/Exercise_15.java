package com.rusin.StringExersise;

public class Exercise_15 {
    public static void main(String[] args) {
        String str = new String("JHGJHGhjgHGUY GUY SJJKhjhkjUIUIHJhjhKJHGK");
        char[] array = str.toCharArray();
        int count = 0;
        for (char c : array) {
            if(c >= 'a'&& c <= 'z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
