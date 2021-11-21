package com.rusin.Exercises_Part_1_2;

public class Main {
    public static void main(String[] args) {
        Person Pavel = new Person();
        Pavel.setFirstName("Pavel");
            System.out.println("Name : " + Pavel.getFirstName());
        Pavel.setLastName("Vasil'evich");
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

    }
}
