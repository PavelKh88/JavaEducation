package com.rusin.Exercises_Part_1_21;

public class Test {
    public static void main(String[] args) {
    Person p1 = new Person("Ivan");
    Person p2 = new Person("Petr");
    Apple apple = new Apple();
        p1.pickApple(apple);
        System.out.println(p1);
        p1.giveApple(p2);
        System.out.println(p2);
        System.out.println(p1);
        p2.giveApple(p1);
        System.out.println(p1);
        System.out.println(p2);
    }
}
