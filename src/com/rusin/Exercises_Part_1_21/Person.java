package com.rusin.Exercises_Part_1_21;

import java.util.Objects;

public class Person {

    private String name;
    private Apple apple;

    Person(String name){
        this.name = Objects.requireNonNull(name, "Name must not be null");
    }

    public void pickApple(Apple apple) {
        this.apple = apple;
    }

    public void giveApple(Person person) {
        person.apple = this.apple ;
        this.apple = null ;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", apple=" + apple +
                '}';
    }
}
