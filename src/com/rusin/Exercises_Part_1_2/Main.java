package com.rusin.Exercises_Part_1_2;

public class Main {
    public static void main(String[] args) {
        Person pavel = new Person();
        pavel.setFirstName("pavel");
            System.out.println("Name : " + pavel.getFirstName());
        pavel.setSecondName("Vasil'evich");
            System.out.println("Second Name : " + pavel.getSecondName());
        pavel.setDateOfBirsday("08/05/1988");
            System.out.println("Date of birsday : " + pavel.getDateOfBirsday());
        pavel.setCurrentAge(33);
            System.out.println("Current Age : " + pavel.getCurrentAge());
        pavel.setLivingAddress("Kharkov");
            System.out.println("Living Address : " + pavel.getLivingAddress());
        pavel.setSex("Male");
            System.out.println("Sex : " + pavel.getSex());
        pavel.setProfession("Worker");
            System.out.println("Profession : " + pavel.getProfession());
        pavel.setMarried("Yes");
            System.out.println("Is married : " + pavel.getMarried());
        pavel.setChildrens(2);
            System.out.println("Amount of Childrens : " + pavel.getChildrens());
/////////////////
        System.out.println();
        Person max = new Person();
        max.setFirstName("Maxim");
        max.setSecondName("Vasil'evich");
        max.setDateOfBirsday("08/03/1997");
        max.setCurrentAge(26);
        max.setLivingAddress("Kharkov");
        max.setSex("Male");
        max.setProfession("Worker");
        max.setMarried("No");
        max.setChildrens(0);

        System.out.println(max.getFirstName());
        System.out.println(max.getSecondName());
        System.out.println(max.getDateOfBirsday());
        System.out.println(max.getCurrentAge());
        System.out.println(max.getLivingAddress());
        System.out.println(max.getSex());
        System.out.println(max.getMarried());
        System.out.println(max.getChildrens());
    }
}
