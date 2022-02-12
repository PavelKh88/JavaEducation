package com.rusin.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx1 {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOGNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOGNICI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new BestFriend("Vanya", friend1Action,exchanger);
        new BestFriend("Petya", friend2Action,exchanger);

    }
}

enum Action {
     KAMEN,NOGNICI,BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    private void WhoWins(Action myAction, Action myFriendAction) {
        if((myAction == Action.KAMEN && myFriendAction == Action.NOGNICI)
        ||(myAction == Action.NOGNICI && myFriendAction == Action.BUMAGA)
        ||(myAction == Action.BUMAGA && myFriendAction == Action.KAMEN)){
            System.out.println(name + " Wins!!!");
        }
    }
    public void run () {
        Action replay;
        for (Action action : myAction) {
            try {
                replay = exchanger.exchange(action);
                WhoWins(action,replay);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}