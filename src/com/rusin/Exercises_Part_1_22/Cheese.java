package com.rusin.Exercises_Part_1_22;

public class Cheese extends Product{

    Cheese(String name, double weight, ExpirationDate expirationDate) {
        super(name, weight, expirationDate);

    }
    @Override
    public String toString() {
        return "Cheese{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }
}
