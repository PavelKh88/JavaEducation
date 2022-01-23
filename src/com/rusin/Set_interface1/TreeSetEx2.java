package com.rusin.Set_interface1;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Mariya", 3);
        Student st5 = new Student("Olya", 4);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Student st6 = new Student("Sasha", 2);
        System.out.println(students);

        System.out.println(st3.equals(st6));
        System.out.println(st3.hashCode() == st6.hashCode());
    }
}

  class Student implements Comparable<Student> {
    private String name;
    private int course;

      public Student(String name, int course) {
          this.name = name;
          this.course = course;
      }

      @Override
      public int compareTo(Student other) {
          return this.course-other.course;
      }

      @Override
      public String toString() {
          return "Student{" +
                  "name='" + name + '\'' +
                  ", course=" + course +
                  '}';
      }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Student student = (Student) o;
          return course == student.course ;
      }

      @Override
      public int hashCode() {
          return Objects.hash(course);
      }
  }
