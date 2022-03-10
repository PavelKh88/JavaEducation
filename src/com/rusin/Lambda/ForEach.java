package com.rusin.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("Kak Dela");
        list.add("Normalno");
        list.add("poka");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el -> {
            System.out.println(el);
            el *=2;
            System.out.println(el);
        });

    }
}
