package com.rusin.StringExerсise;

public class Exercise_34_interesting {
    public static void main(String[] args) {
        String str = ("If debugging  is the   process  of removing   software bugs, then   programming must be the process   of putting them in ");
        char[] array = str.toCharArray();
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == ' ' && array[i - 1] == ' ') {
                continue;
            }
            stringBuilder.append(array[i]);
        }
        System.out.println(str);
        System.out.println(stringBuilder);
    }
}
