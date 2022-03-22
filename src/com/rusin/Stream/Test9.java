package com.rusin.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Test2.Student st1 = new Test2.Student("pavel", 'm', 22, 2,6.7);
        Test2.Student st2 = new Test2.Student("ivan", 'm', 28, 1,8.2);
        Test2.Student st3 = new Test2.Student("oksana", 'f', 25, 4,9.7);
        Test2.Student st4 = new Test2.Student("petr", 'm', 30, 5,8.0);
        Test2.Student st5 = new Test2.Student("maryia", 'f', 19, 1,7.8);

        List<Test2.Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);


        List<Integer> intList =  studentList.stream().mapToInt(e -> e.getAge()).boxed().collect(Collectors.toList());
        System.out.println(intList);

        int sum = studentList.stream().mapToInt(e -> e.getAge()).sum();
        System.out.println(sum);
        double average = studentList.stream().mapToInt(e -> e.getAge()).average().getAsDouble();
        System.out.println(average);
//        Test2.Student min = studentList.stream().min((x, y) -> (x.getAge() - y.getAge())).get();
//        System.out.println(min);
//        System.out.println("---------------------");
//        studentList.stream().filter( e -> e.getAge() >20).forEach(System.out :: println);
//        System.out.println("---------------------");
//        studentList.stream().filter( e -> e.getAge() >20).limit(2).forEach(System.out :: println);
//        System.out.println("---------------------");
//        studentList.stream().filter( e -> e.getAge() >20).skip(2).forEach(System.out :: println);
    }
}
