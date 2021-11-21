package com.rusin.Exercises_Part_1_2;

public class Main {
    public static void main(String[] args) {
        Person Pavel = new Person();
        Pavel.setFirstName("Pavel");
            System.out.println("Name : " + Pavel.getFirstName());
        Pavel.setSecondName("Vasil'evich");
            System.out.println("Second Name : " + Pavel.getSecondName());
        Pavel.setDateOfBirsday("08/05/1988");
            System.out.println("Date of birsday : " + Pavel.getDateOfBirsday());
        Pavel.setCurrentAge(33);
            System.out.println("Current Age : " + Pavel.getCurrentAge());
        Pavel.setLivingAddress("Kharkov");
            System.out.println("Living Address : " + Pavel.getLivingAddress());
        Pavel.setSex("Male");
            System.out.println("Sex : " + Pavel.getSex());
        Pavel.setProfession("Worker");
            System.out.println("Profession : " + Pavel.getProfession());
        Pavel.setMarried("Yes");
            System.out.println("Is married : " + Pavel.getMarried());
        Pavel.setChildrens(2);
            System.out.println("Amount of Childrens : " + Pavel.getChildrens());
/////////////////
        System.out.println();
        Person Max = new Person();
        Max.setFirstName("Maxim");
        Max.setSecondName("Vasil'evich");
        Max.setDateOfBirsday("08/03/1997");
        Max.setCurrentAge(26);
        Max.setLivingAddress("Kharkov");
        Max.setSex("Male");
        Max.setProfession("Worker");
        Max.setMarried("No");
        Max.setChildrens(0);

        System.out.println(Max.getFirstName());
        System.out.println(Max.getSecondName());
        System.out.println(Max.getDateOfBirsday());
        System.out.println(Max.getCurrentAge());
        System.out.println(Max.getLivingAddress());
        System.out.println(Max.getSex());
        System.out.println(Max.getMarried());
        System.out.println(Max.getChildrens());
    }
}
