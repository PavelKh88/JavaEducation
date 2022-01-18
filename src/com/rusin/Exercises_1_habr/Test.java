package com.rusin.Exercises_1_habr;

public class Test {
    public static void main(String[] args) {
        double temp = 18.5;
        Celsius celsius = new Celsius();
        System.out.println(celsius.getConvertedValue(temp));
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println(fahrenheit.getConvertedValue(temp));
        Kelvin kelvin = new Kelvin();
        System.out.println(kelvin.getConvertedValue(temp));
    }
}
