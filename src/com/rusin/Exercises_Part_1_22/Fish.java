package com.rusin.Exercises_Part_1_22;

public class Fish extends Product {
    Fish(String name, double weight, ExpirationDate expirationDate){
        super(name, weight, expirationDate);
    }

    @Override
    public String toString() {
        return "Fish{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }

}
