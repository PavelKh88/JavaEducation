package com.rusin.Exercises_Part_1_22;

public class Egg extends Product {

    Egg(String name, int weight, ExpirationDate expirationDate) {
        this.setName(name);
        this.setWeight(weight);
        this.setExpirationDate(expirationDate);
    }
    @Override
    public String toString() {
        return "Egg{ " + " name = " + getName() + " quantity = " + getWeight() + " " + getExpirationDate() + '}';
    }

}
