package com.rusin.Gerbert_Shild;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println(a + " До вызова " + b);

        ob.noChange(a , b);
        System.out.println(a + " После вывода метода " + b);

    }
}
