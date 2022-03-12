package com.rusin.Stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};
        Arrays.stream(array).forEach(el -> {
            if(el % 2 != 0) {
                System.out.println(el);
            }
        });

    }
}
