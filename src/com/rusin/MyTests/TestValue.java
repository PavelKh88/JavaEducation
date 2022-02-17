package com.rusin.MyTests;

public class TestValue {
    public static void main(String[] args) throws InterruptedException {
        CardGenerator cardGenerator = new CardGenerator();
        Thread threadValue = new Thread(cardGenerator);
        threadValue.start();

        Player1 player1 = new Player1("Vanya",cardGenerator);
        player1.start();
        Player1 player2 = new Player1("Sasha", cardGenerator);
        player2.start();
    }

}
