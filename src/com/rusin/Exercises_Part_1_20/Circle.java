package com.rusin.Exercises_Part_1_20;

public class Circle extends Figure{
    private double circumference ;
    private double diameter ;
    private String name;

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Circle(double circumference, double diameter, String name) {
        this.circumference = circumference;
        this.diameter = diameter;
        this.name = name;
    }

    public void getArea() {
        double area = (diameter * diameter) / (4 * Math.PI);
        System.out.println("Area = " + area);

    }

    public  void getPerimeter() {
        System.out.println("Diametr = " +  diameter);
    }

    public  void getName() {
        System.out.println("Name " + name);

    }
}
