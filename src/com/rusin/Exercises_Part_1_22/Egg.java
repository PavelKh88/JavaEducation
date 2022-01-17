package com.rusin.Exercises_Part_1_22;

public class Egg extends Product {

    Egg(String name, int weight, ExpirationDate expirationDate) {
        super(name, weight, expirationDate);
    }
    @Override
    public String toString() {
        return "Egg{ " + " name = " + getName() + " quantity = " + getWeight() + " " + getExpirationDate() + '}';
    }

}
