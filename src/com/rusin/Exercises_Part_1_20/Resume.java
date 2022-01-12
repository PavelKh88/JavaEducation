package com.rusin.Exercises_Part_1_20;

import java.lang.reflect.Field;

public class Resume {
    private String fullName;
    private String sex;
    private DayOfBirth dayOfBirth;
    private double yearsOfExperience;
    private String skills;
    private double wishedSalary;

    public Resume(String fullName, String sex, DayOfBirth dayOfBirth, double yearsOfExperience, String skills, double wishedSalary) {
        this.fullName = fullName;
        this.sex = sex;
        this.dayOfBirth = dayOfBirth;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = skills;
        this.wishedSalary = wishedSalary;
    }


    @Override
    public String toString() {
        return "Resume{" +
                "fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", yearsOfExperience=" + yearsOfExperience +
                ", skills='" + skills + '\'' +
                ", wishedSalary=" + wishedSalary +
                '}';
    }

    public static class DayOfBirth  {
        private int day;
        private int month;
        private int year;

        public DayOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void abc (Resume resume1){
           Class clazz = resume1.getClass();
            Field [] array = clazz.getDeclaredFields();
            for(Field f : array) {
                System.out.println(f);
            }
        }

        @Override
        public String toString() {
            return "DayOfBirth{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }
    }


}
