package com.rusin.Exercises_Part_1_27;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentDatabase base1 = new StudentDatabase();
        Student st1 = new Student("Anna", "Badoeva", "Female", new Person.DayOfBirth(8, 5,1988), "Programing", "Kibernetica",6.6);
        Student st2 = new Student("Petr", "Andreevich", "Male", new Person.DayOfBirth(8, 5,1988), "Programing", "Kibernetica",9.4);
        Student st3 = new Student("Alla", "Stepanovna", "Female", new Person.DayOfBirth(8, 5,1988), "Programing", "Kibernetica",7.5);
        Student st4 = new Student("Andrey", "Alekseevich", "Male", new Person.DayOfBirth(8, 5,1988), "Programing", "Kibernetica",8.2);
        Student st5 = new Student("Anna", "Badoeva", "Female", new Person.DayOfBirth(8, 5,1988), "Programing", "Kibernetica",9.4);

        base1.addStudent(st1);
        base1.addStudent(st2);
        base1.addStudent(st3);
        base1.addStudent(st4);
        base1.addStudent(st5);

        List<Student> firstName = base1.findByFirstName("Anna");
        System.out.println(base1.findBySex("Male"));




    }
}
