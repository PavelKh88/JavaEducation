package com.rusin.Stream;

import com.rusin.Stream.Test2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("pavel", 'm', 22, 2,6.7);
        Student st2 = new Student("ivan", 'm', 28, 1,8.2);
        Student st3 = new Student("oksana", 'f', 25, 4,9.7);
        Student st4 = new Student("petr", 'm', 30, 5,8.0);
        Student st5 = new Student("maryia", 'f', 19, 1,7.8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

//        Map<Integer,List<Student>> map = studentList.stream().map(el -> {el.setName(el.getName().toUpperCase());return el;
//                }).collect(Collectors.groupingBy(el -> el.getCourse()));
//        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue().toString());
//        }

//
//
        Map<Boolean,List<Student>> map = studentList.stream().collect(Collectors.partitioningBy(el ->
                el.getAvgGrade() > 7)  );
        for(Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
    }
}
