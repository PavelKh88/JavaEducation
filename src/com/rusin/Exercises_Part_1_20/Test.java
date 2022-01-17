package com.rusin.Exercises_Part_1_20;

public class Test {
    public static void main(String[] args) {

        Resume r1 = new Resume("Pavel Rusin", Sex.MALE, new Resume.DayOfBirth(8,5,1988),2, "tenacity",100.5);
        System.out.println(r1);
        WebPortal wP1 = new WebPortal();
        wP1.addResume(r1);
        System.out.println(wP1);

    }
}
