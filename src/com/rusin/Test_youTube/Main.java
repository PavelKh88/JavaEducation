package com.rusin.Test_youTube;

public class Main {
    public static void main(String[] args) {
    Person  person1 = new Person();
    person1.setName("Roman");
    person1.setAge(50);
    Person person2 = new Person();
    person2.setName("Vova");
    person2.setAge(20);
    person1.speak();
    person2.speak();
    person1.sayHello();
    person1.calculateYearsToRetirement();
    int years1 = person1.calculateYearsToRetirement();
        System.out.println(years1);
    }
}
