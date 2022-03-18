package com.rusin.Stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Test2.Student st1 = new Test2.Student("pavel", 'm', 22, 2,6.7);
        Test2.Student st2 = new Test2.Student("ivan", 'm', 28, 1,8.2);
        Test2.Student st3 = new Test2.Student("oksana", 'f', 25, 4,9.7);
        Test2.Student st4 = new Test2.Student("petr", 'm', 30, 5,8.0);
        Test2.Student st5 = new Test2.Student("maryia", 'f', 19, 1,7.8);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");

        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st3);
        f2.addStudent(st4);
        f2.addStudent(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream()).forEach(e -> System.out.println(e.getName()));

    }
}

class Faculty {
    String name;
    List<Test2.Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public List<Test2.Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public void addStudent(Test2.Student st) {
        studentOnFaculty.add(st);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", studentOnFaculty=" + studentOnFaculty +
                '}';
    }
}
