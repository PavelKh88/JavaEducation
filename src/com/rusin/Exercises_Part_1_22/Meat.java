package com.rusin.Exercises_Part_1_22;

public class Meat extends Product{
    Meat(String name, double weight, ExpirationDate expirationDate) {
        this.setName(name);
        this.setWeight(weight);
        this.setExpirationDate(expirationDate);
    }

    @Override
    public String toString() {
        return "Meat{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }
}
