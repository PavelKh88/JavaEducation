package com.rusin.Exercises_Part_1_19;

public class ComplexNumber {
    int realPart;
    int imaginaryPart;

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
        this.realPart = realPart;
    }

    @Override

    public String toString() {
        return "RealPart : " + realPart + " ImaginaryPart : " + imaginaryPart;
    }
    public ComplexNumber add(ComplexNumber com2) {
        return new ComplexNumber(realPart + com2.realPart, imaginaryPart + com2.imaginaryPart);
    }
    public ComplexNumber substraction(ComplexNumber com2) {
        return new ComplexNumber(realPart - com2.realPart, imaginaryPart - com2.imaginaryPart);
    }

    public ComplexNumber multiplication(ComplexNumber com2) {
        return new ComplexNumber(realPart * com2.realPart, imaginaryPart * com2.imaginaryPart);
    }
}
