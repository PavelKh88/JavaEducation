package com.rusin.Test_youTube;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("My name is " + name + " i am " + age + " years old.");
    }
    public void sayHello(){
        System.out.println("Hello !!!");
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;

    }
}
