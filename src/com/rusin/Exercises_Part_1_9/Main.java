package com.rusin.Exercises_Part_1_9;

public class Main {
    public static void main(String[] args) {
    CoffeeMachine v1 = new CoffeeMachine();
        v1.statusCM();
        v1.onCM();
        System.out.println();
        v1.statusCM();
        System.out.println();
        v1.cappuccino();
        v1.statusCM();

        v1.someCoffee(200,100,90);
        v1.statusCM();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        CoffeeMachines2 v2 = new CoffeeMachines2();
        v2.onCM();
        v2.cappuccino();
        v2.statusCM();
    }
}
