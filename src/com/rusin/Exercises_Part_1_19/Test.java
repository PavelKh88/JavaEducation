package com.rusin.Exercises_Part_1_19;

public class Test {
    public static void main(String[] args) {
    ComplexNumber com1 = new ComplexNumber(5, 2);
    ComplexNumber com2 = new ComplexNumber(12,3);
    ComplexNumber resultAdd = com1.add(com2);
        System.out.println(resultAdd);
    ComplexNumber resultSub = com1.substraction(com2);
        System.out.println(resultSub);
    ComplexNumber resultMult = com1.multiplication(com2);
        System.out.println(resultMult);
    }
}
