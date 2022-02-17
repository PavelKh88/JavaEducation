package com.rusin.MyTests;

import java.util.concurrent.Semaphore;

public class TestAuction {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        auctioneer.start();
        Buyer buyer1 = new Buyer("Ivan");
        buyer1.start();
        Buyer buyer2 = new Buyer("Pavel");
        buyer2.start();

    }
}
