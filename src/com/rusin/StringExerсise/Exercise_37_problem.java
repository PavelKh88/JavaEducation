package com.rusin.StringExerсise;

public class Exercise_37_problem {
    public static void main(String[] args) {
        String str = ("You show me the man and ll show you the rule");
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'a'){
                count++;
            }
        }
        int[]array2 = new int[count];
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < array.length ; i++) {
            count2++;
            if(array[i] == 'a'){

                array2[count3] = count2;
                count3++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(i == array2[count - 1]) {
                continue;
            }
            else {stringBuilder.append(array[i]);
            }
        }
        System.out.println(stringBuilder);












    }
}
