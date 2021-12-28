package com.rusin.Exercises_Part_1_18;

public class Fraction {
    private int numerator;
    private int denumenator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenumenator() {
        return denumenator;
    }

    public void setDenumenator(int denumenator) {
        this.denumenator = denumenator;
    }

    public Fraction(int numerator, int denumenator) {
        this.denumenator = denumenator;
        this.numerator =numerator;
    }

    public Fraction add (Fraction f2) {
        return new Fraction(numerator + f2.numerator,denumenator + f2.denumenator  );
    }

    public Fraction subtraction (Fraction f2) {
        return new Fraction(numerator - f2.numerator,denumenator - f2.denumenator  );
    }

    public Fraction multiplication (Fraction f2) {
        return new Fraction(numerator * f2.numerator,denumenator * f2.denumenator  );
    }
    public Fraction devision (Fraction f2) {
        return new Fraction(numerator / f2.numerator,denumenator / f2.denumenator  );
    }

    @Override
    public String toString() {
        return "Numerator : " + numerator + " Denumenator : " + denumenator;
    }
}
