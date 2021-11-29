package com.rusin.StringExerсise;

import java.util.Arrays;

public class Exercise_9 {
    public static void main(String[] args) {
        String str = "”All programming is maintenance programming,\n" +
                "because you are rarely writing original code.” (Dave Thomas)";

        String[] array = str.split("\\W+");


        System.out.println(Arrays.toString(array));
    }
}
