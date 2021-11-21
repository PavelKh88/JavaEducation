package com.rusin.OopStart;

public class Main {
    public static void main(String[] args) {
        Person vlad = new Person(180, "Vlad");

        vlad.say("Stas");
        System.out.println(vlad.name + "'s height is  " +  vlad.height);
        Person stas = new Person(190, "Stas");
        stas.say("Vlad");
        System.out.println(stas.height);
    }
}
