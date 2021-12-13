package com.rusin.Exercises_Part_1_9_Problem;

public class Fraction {
   private int numerator;
   private int denominator;
        public Fraction(int numerator,int denominator)
        {
        this.denominator = denominator;
        this.numerator = numerator;
        }
    public double add (){
        double a = (double) numerator  / (double) denominator;
        return a;
    }

}
