package com.rusin.LinkedHashMapExemple1;

import java.util.LinkedHashMap;

public class LinkedHashMapTest1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap1 = new LinkedHashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        
        linkedHashMap1.put(7.2, st3);
        linkedHashMap1.put(7.5, st4);
        linkedHashMap1.put(5.8, st1);
        linkedHashMap1.put(6.4, st2);

        System.out.println(linkedHashMap1);

    }
}
