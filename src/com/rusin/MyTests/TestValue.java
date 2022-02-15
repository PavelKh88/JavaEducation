package com.rusin.MyTests;

public class TestValue {
    public static void main(String[] args) throws InterruptedException {
        Thread threadValue = new Thread(new Value());
        threadValue.start();
        Player1 player1 = new Player1("Vanya");
        player1.start();
        Player1 player2 = new Player1("Sasha");
        player2.start();
    }

}
