package com.rusin.MyTests;

import java.util.Iterator;
import java.util.Objects;

public class Buyer extends Thread {
    private static Integer buyerPrice = 0;
    private  String name;

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 50; i <= 10_000 ; i += 50) {
            buyerPrice = i ;

            try {
                Thread.sleep(500);
            System.out.println(buyerPrice);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Objects.equals(buyerPrice,Auctioneer.price)) {
                System.out.println(name + " Buy Lot!!!");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println( "lot Sold");
                Auctioneer.sold = false;
                i = 0;
            }
        }

    }
}
