package com.rusin.MyTests;

import java.util.Iterator;
import java.util.Objects;

public class Buyer extends Thread {
    private static Integer buyerPrice = 0;
    public static Boolean buy = true;

    @Override
    public void run() {
        for (int i = 50; i <= 10_000 ; i += 50) {

            try {
                Thread.sleep(500);
            buyerPrice = i ;
            System.out.println(buyerPrice);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Objects.equals(buyerPrice,Auctioneer.price)) {
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
