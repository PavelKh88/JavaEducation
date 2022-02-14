package com.rusin.Lambda;

import java.util.ArrayList;

public class StudentsInfo {
    public static void main(String[] args) {
        Students st1 = new Students("Ivan", 'm',22, 3, 8.3 );
        Students st2= new Students("Nikolay", 'm',28, 2, 6.4 );
        Students st3 = new Students("Elena", 'f',19, 1, 8.9 );
        Students st4 = new Students("Petr", 'm',35, 4, 7 );
        Students st5 = new Students("Marya", 'f',23, 3, 9.1 );

        ArrayList<Students> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        StudentsInfo studentsInfo = new StudentsInfo();
        studentsInfo.printStudentUnderAge(arrayList, 20);
     }
     void printStudentOverGrade(ArrayList<Students> a1, double grade) {
         for (Students students : a1) {
             if(students.avgGrade > grade){
                 System.out.println(students);
             }
         }
    }
    void printStudentMixCondition(ArrayList<Students> a1, int age, double grade, char sex) {
        for (Students students : a1) {
            if(students.age < age && students.avgGrade < grade && students.sex == sex){
                System.out.println(students);
            }
        }
    }
    void printStudentUnderAge(ArrayList<Students> a1, int age) {
        for (Students students : a1) {
            if(students.age < age) {
                System.out.println(students);
            }
        }
    }
}

