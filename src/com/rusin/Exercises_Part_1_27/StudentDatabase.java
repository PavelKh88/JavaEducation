package com.rusin.Exercises_Part_1_27;


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

    public void findByFirstName(String firstName) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getFirstName() == firstName) {
                    System.out.println("A student with this name is found and located by index = " + i);
//                    return;
                }
            }
//                    System.err.println("Student with that name not found");
        }

    public void findByLastName(String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName() == lastName) {
                System.out.println("A student with this Last name is found and located by index = " + i);
            }
        }
//                    System.err.println("Student with that Last name not found");
    }
    public void findBySex(String sex) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSex() == sex) {
                System.out.println("A student with this Sex is found and located by index = " + i);
//                    return;
            }
        }
//                    System.err.println("Student with that Sex not found");
    }
    public void findBySpeciality(String speciality) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSpeciality() == speciality) {
                System.out.println("A student with this speciality is found and located by index = " + i);
//                    return;
            }
        }
//                    System.err.println("Student with that speciality not found");
    }
    public void findByDepartment(String department) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getDepartment() == department) {
                System.out.println("A student with this department is found and located by index = " + i);
//                    return;
            }
        }
//                    System.err.println("Student with that department not found");
    }

    public void findByAverageRate(double averageRate) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageRate() == averageRate) {
                System.out.println("A student with this averageRate is found and located by index = " + i);
//                    return;
            }
        }
//                    System.err.println("Student with that averageRate not found");
    }

    public void findAll() {
        for (Student student : students) {
            System.out.println("Student located by index " + students.indexOf(student) + " " + student);

        }
    }




    @Override
    public String toString() {
        return "StudentDatabase{" +
                "students=" + students +
                '}';
    }
}
