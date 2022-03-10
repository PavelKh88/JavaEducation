package com.rusin.Lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("Ok");
        list.add("Uchim Java");
        list.add("A imenno Lambdas");
        list.removeIf(element -> element.length() < 5);
        System.out.println(list);
    }
}
