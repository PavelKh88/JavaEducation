package com.rusin.Exercises_Part_1_27;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
//   for (Student student : students) {
//              if(student.getFirstName() == firstName) {
//                System.out.println("Есть студент с таким именем , студент под индексом " + student);
//                return;
//              }
//            }
    public void findByFirstName(String firstName) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getFirstName() == firstName) {
                    System.out.println("A student with this name is found and located by index = " + i);
                    return;
                }
            }
                    System.err.println("Student with that name not found");
        }

    public void findByLastName(String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName() == lastName) {
                System.out.println("A student with this Last name is found and located by index = " + i);
            }
        }
                    System.err.println("Student with that Last name not found");

    }



    @Override
    public String toString() {
        return "StudentDatabase{" +
                "students=" + students +
                '}';
    }
}
