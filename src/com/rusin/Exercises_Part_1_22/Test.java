package com.rusin.Exercises_Part_1_22;

public class Test {
    public static void main(String[] args) {
        Cheese cheese1 = new Cheese("Bree", 500.0, new Product.ExpirationDate(12, 1, 2022));
        Cheese cheese2 = new Cheese("Radomyr", 450.0,new Product.ExpirationDate(13,2,2022));
        System.out.println(cheese2);
        System.out.println(cheese1);
        Sausage sausage1 = new Sausage("Detskie", 1000.0, new Product.ExpirationDate(15, 3, 2022));
        System.out.println(sausage1);
        Fish fish1 = new Fish("Sudak", 700, new Product.ExpirationDate(13, 1, 2022));
        System.out.println(fish1);
        Meat meat1 = new Meat("Pork", 1500.0,new Product.ExpirationDate(14,1,2022));
        System.out.println(meat1);
        Egg egg1 = new Egg("Egg",30, new Product.ExpirationDate(12, 1, 2022));
        System.out.println(egg1);
        Refrigerator refrigerator1 = new Refrigerator();
        refrigerator1.addProduct(egg1);
        refrigerator1.addProduct(meat1);
        refrigerator1.addProduct(cheese1);
        refrigerator1.addProduct(sausage1);
        refrigerator1.addProduct(fish1);
        System.out.println(refrigerator1);

    }
}
