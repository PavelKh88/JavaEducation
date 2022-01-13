package com.rusin.Exercises_Part_1_20;

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
        if(fullName == null) {
            return 0 ;
        }
        if(sex == null) {
            return 0 ;
        }
        if(dayOfBirth == null) {
            return 0 ;
        }
        if(skills == null) {
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
