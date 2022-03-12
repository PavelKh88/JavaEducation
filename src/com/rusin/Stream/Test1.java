package com.rusin.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("Kak Dela");
        list.add("Uchem Java");
        List<String> list2 = new ArrayList<>();
        list2 = list.stream().map(el -> el + "||").collect(Collectors.toList());
//        System.out.println(list2);

        int[] array = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.stream(array).map(el -> {
            if(el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array2));

        Set<String> set = new TreeSet<>();
        set.add("Privet");
        set.add("Poka");
        set.add("Kak Dela");
        set.add("Uchem Java");
        System.out.println(set);

        Set<Integer> set1 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
