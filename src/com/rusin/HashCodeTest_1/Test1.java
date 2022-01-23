package com.rusin.HashCodeTest_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {

        Map<Student, Double> mapStudents = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 2);
        mapStudents.put(st1, 7.5);
        mapStudents.put(st2, 8.7);
        mapStudents.put(st3, 9.2);
        System.out.println(mapStudents);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        Student st5 = new Student("Igor", "Sidorov", 4);
        boolean result = mapStudents.containsKey(st4);
//        System.out.println(result);
//        System.out.println(st1.equals(st4));
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        for (Map.Entry<Student, Double> entry : mapStudents.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}



