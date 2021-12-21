package com.rusin.Exercises_Part_1_9;

public class CoffeeMachines2 extends CoffeeMachine {
    private int sugar = 0;

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
    @Override
    public void  statusCM(){
        super.statusCM();
        System.out.println("Sugar is : " + sugar);
    }

}
