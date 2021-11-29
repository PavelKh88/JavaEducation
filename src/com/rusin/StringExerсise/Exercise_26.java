package com.rusin.StringExerсise;

public class Exercise_26 {
    public static void main(String[] args) {
        String str = new String("Love tells us many things that are not so");
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = str.toCharArray();
        int count = 0;
        for (char c : array) {
            count++;
            if(c == ' '){
                count = 0;
            }
            if(count == 1){
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
    }
}
