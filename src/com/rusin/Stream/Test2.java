package com.rusin.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
     Student st1 = new Student("pavel", 'm', 22, 2,6.7);
     Student st2 = new Student("ivan", 'm', 28, 1,8.2);
     Student st3 = new Student("oksana", 'f', 25, 4,9.7);
     Student st4 = new Student("petr", 'm', 30, 5,8.0);
     Student st5 = new Student("maryia", 'f', 19, 1,7.8);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        List<Student> list2 = new ArrayList<>();
         list2 = list.stream().map(e -> {e.setName(e.getName().toUpperCase());
                                return e;    }).filter(e -> e.getSex() == 'm').sorted((x,y) -> x.getAge()-y.getAge())
                         .collect(Collectors.toList());



        System.out.println(list2);



//        List<Student> list2 = list.stream().filter(el -> el.getAge() < 20).collect(Collectors.toList());
//
//        System.out.println(list2);
//        list = list.stream().sorted((x , y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(list);

    }

    static class Student{

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
 }
}
