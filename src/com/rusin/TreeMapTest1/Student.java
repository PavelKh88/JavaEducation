package com.rusin.TreeMapTest1;

import java.util.Objects;

class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

