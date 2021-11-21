package com.rusin.Test2;

public class Main {
    public static void main(String[] args) {
    Computer comp = new Computer();
    comp.i7.start();
    comp.transfer.start();
    comp.i7.shutdown();
    }
}
