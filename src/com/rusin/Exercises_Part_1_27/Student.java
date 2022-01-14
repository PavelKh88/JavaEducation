package com.rusin.Exercises_Part_1_27;

public class Student extends Person {
    private String speciality;
    private String department;
    private double averageRate;

    Student(String firstName, String lastName, String sex, DayOfBirth dayOfBirth, String speciality, String department, double averageRate) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSex(sex);
        this.setDayOfBirth(dayOfBirth);
        this.speciality = speciality;
        this.department = department;
        this.averageRate = averageRate;

    }

    public String getSpeciality() {
        return speciality;
    }

    public String getDepartment() {
        return department;
    }

    public double getAverageRate() {
        return averageRate;
    }

    @Override
    public String toString() {

        return super.toString() +
                "Student{" +
                "speciality='" + speciality + '\'' +
                ", department='" + department + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }
}
