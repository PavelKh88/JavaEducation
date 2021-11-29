package com.rusin.StringExerсise;

public class Exercise_17 {
    public static void main(String[] args) {
        String str = new String("sdkf jgskjdfnvjksdfngjkasdaf kbvkamsndiugkhbahjdf dbncva");
        char[] array = str.toCharArray();
        int count = 0;
        for (char c : array) {
            if(c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u' || c !='y'){
                count++;
            }
        }
        System.out.println(count);
    }
}
