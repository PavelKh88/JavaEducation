package com.rusin.Stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 4, 7, 32, 34, 23, 83, 21,90};
//        array = Arrays.stream(array).sorted().toArray();
//        Arrays.stream(array).forEach(el -> System.out.println(el));
        int result = Arrays.stream(array).filter(e -> e % 2 == 0).map(e -> {if(e % 4 == 0){ e = e / 4 ;} return e ;})
                                                    .reduce((a,e) -> a +e).getAsInt();
        System.out.println(result);
        //4,32,34,90; 1 , 8 , 34, 90
    }
}
