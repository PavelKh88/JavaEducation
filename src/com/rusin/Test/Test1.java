package com.rusin.Test;

public class Test1 {
    public static void main(String[] args) {
        Person vitya = new Person (180, "Vitya");
        vitya.height = 120;
        vitya.say("Gorge");
        System.out.println(vitya.name + "'s height is " +  vitya.height);
        Person vlad = new Person ();
        System.out.println(vlad.height);
        Person dima = new Person ("Dima");
        System.out.println(dima.name);
        System.out.println();
        Student freshman = new Student(76, "Viktor" , 2);
        freshman.tell();
        System.out.println();
        Student freash = new Student(135, "Vlad" , 4);
        freash.tell();
    }
}
