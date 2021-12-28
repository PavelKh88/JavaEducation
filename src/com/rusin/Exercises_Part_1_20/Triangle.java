package com.rusin.Exercises_Part_1_20;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    private String name;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Triangle(double a, double b, double c , String name) {
        this.a = a ;
        this.b = b ;
        this.c = c ;
        this.name = name;
    }
   @Override
    public void getArea() {
       double area = 0.5 * a * b;
       System.out.println("Area = " + area);
    }

    @Override
    public void getPerimeter(){
        double perimetr = a + b + c ;
        System.out.println( "Perimeter =  " + perimetr);
    }

    @Override
    public void getName(){
        System.out.println(name + ":" + " a = " + a + " b = " + b + " c = " + c );
    }
}
