package com.rusin.LinkedListTest1;

import java.util.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 3);
        Student student2 = new Student("Nikolay", 2);
        Student student3 = new Student("Elena", 1);
        Student student4 = new Student("Petr", 4);
        Student student5 = new Student("Mariya", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);

        System.out.println(studentLinkedList);

        Student student6 = new Student("Zaur", 3);
        Student student7 = new Student("Igor", 4);
        studentLinkedList.add(student6);
        studentLinkedList.add(1,student7);
        System.out.println(studentLinkedList);
        studentLinkedList.remove(3);
        System.out.println(studentLinkedList);
    }
}
