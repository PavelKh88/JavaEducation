package com.rusin.MapTest1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(3567,"Ivan Ivanov");
        map1.put(6578,"Mariya Sidorova");
        map1.put(12553,"Nikolay Petrov");
        map1.putIfAbsent(1000,"Oleg Ivanov");
        map1.put(null,"Sergey Petrov");
        map1.put(1234,null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(12553);
        System.out.println(map1);
        System.out.println(map1.containsValue("Sergey Petrov"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Dobriy");
        System.out.println(map2);
    }
}
