package com.rusin.Test2;

public class Computer {
    class Proccesor{
        private boolean isStart = false;
        public void start () {
            isStart = true;
            System.out.println(" is Start = " + isStart);
        }
        public void shutdown () {
            isStart = false;
            System.out.println(" is Start = " + isStart);
        }
    }
    class RAM{
        private boolean isStart = false;
        public void start () {
            isStart = true;
        }
        public void shutdown () {
            isStart = false;
        }
    }
    Proccesor i7 = new Proccesor();
    RAM transfer = new RAM();
}
