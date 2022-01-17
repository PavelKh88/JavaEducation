package com.rusin.Exercises_Part_1_27;

public  class  Person {
    private String firstName;
    private String lastName;
    private String sex;
    private DayOfBirth dayOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public DayOfBirth getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(DayOfBirth dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }

    public static class DayOfBirth {
     private int day;
     private int month;
     private int year;

     DayOfBirth(int day, int month, int year) {
         this.day = day;
         this.year = year;
         this.month = month;
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
