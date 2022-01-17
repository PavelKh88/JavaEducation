package com.rusin.Exercises_Part_1_27;


import java.util.ArrayList;
import java.util.LinkedList;
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

    public List<Student> findByFirstName(String firstName) {
           List<Student> studentsByFirstName = new LinkedList<>();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getFirstName().equals(firstName)) {
                    studentsByFirstName.add(students.get(i));
                }
            }
               return studentsByFirstName;
        }

    public List<Student> findByLastName(String lastName) {
        List<Student> studentsByLastName = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName().equals(lastName)) {
               studentsByLastName.add(students.get(i));
            }
        }
        return studentsByLastName;

    }
    public List<Student> findBySex(String sex) {
        List<Student> studentsBySex = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSex().equals(sex)) {
                studentsBySex.add(students.get(i));
            }
        }
        return studentsBySex;
    }
    public List<Student> findBySpeciality(String speciality) {
        List<Student> studentsBySpeciality = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSpeciality().equals(speciality)) {
                studentsBySpeciality.add(students.get(i));
            }
        }
        return studentsBySpeciality;
    }
    public List<Student> findByDepartment(String department) {
        List<Student> studentsByDepartment = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getDepartment().equals(department)) {
              studentsByDepartment.add(students.get(i));
            }
        }
        return studentsByDepartment;
    }

    public List<Student> findByAverageRate(double averageRate) {
        List<Student> studentsByAverageRate = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageRate() == averageRate) {
               studentsByAverageRate.add(students.get(i));
            }
        }
        return studentsByAverageRate;
    }

    public List<Student> findAll() {
        return students;
        }





    @Override
    public String toString() {
        return "StudentDatabase{" +
                "students=" + students +
                '}';
    }
}
