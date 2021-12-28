package com.rusin.Exercises_Part_1_18;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Test {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(6, 5);
        Fraction fr2 = new Fraction(2, 3);
        Fraction resultadd = fr1.add(fr2);
        System.out.println(resultadd);
        Fraction resultSub = fr1.subtraction(fr2);
        System.out.println(resultSub);
        Fraction resultMult = fr1.multiplication(fr2);
        System.out.println(resultMult);
        Fraction resultDev = fr1.devision(fr2);
        System.out.println(resultDev);
    }
}
