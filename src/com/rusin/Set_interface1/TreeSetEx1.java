package com.rusin.Set_interface1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(5);
        treeset.add(8);
        treeset.add(2);
        treeset.add(1);
        treeset.add(10);
        System.out.println(treeset);

        treeset.remove(2);
        System.out.println(treeset);
        System.out.println(treeset.contains(2));

    }
}
