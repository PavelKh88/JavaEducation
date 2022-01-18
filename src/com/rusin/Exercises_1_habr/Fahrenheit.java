package com.rusin.Exercises_1_habr;

public class Fahrenheit implements IConverter{

    public double getConvertedValue(double value){
        return 1.8 * value + 32;
    }
}
