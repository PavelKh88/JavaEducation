package com.rusin.StringExerсise;

public class Exercise_6 {
    public static void main(String[] args) {
        String str = new String("Def iciencies come by the kilo and go by the gram");
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
           char c = array [ i ];
           if (Character.isLowerCase(c)) {
                array [i] = Character.toUpperCase(c);
           }
        }
        System.out.println(new String(array));
    }
}
