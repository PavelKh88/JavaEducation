package com.rusin.Gerbert_Shild;

public class OverLoadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;
        ob.ovlDemo();
        ob.ovlDemo(8);
       resI =  ob.ovlDemo(4,4);
       resD = ob.ovlDemo(1.1, 2.2);
        System.out.println(resI);
        System.out.println(resD);
    }
}
