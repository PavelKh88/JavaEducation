package com.rusin.Exercises_Part_1_20;

import java.util.Objects;

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

//    Person(String name){
//        this.name = Objects.requireNonNull(name, "Name must not be null");
//    }

    public int chekNull() {
        if(Objects.isNull(fullName)) {
            return 0 ;
        }
        if(Objects.isNull(sex)) {
            return 0 ;
        }
        if(Objects.isNull(dayOfBirth)) {
            return 0 ;
        }
        if(Objects.isNull(skills)) {
            return 0 ;
        }
        else{
            return 1;
        }
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
