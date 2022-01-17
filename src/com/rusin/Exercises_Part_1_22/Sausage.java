package com.rusin.Exercises_Part_1_22;

public class Sausage extends Product {

    Sausage(String name, double weight, ExpirationDate expirationDate){
        super(name, weight, expirationDate);
    }

    @Override
    public String toString() {
        return "Sausage{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }
}
