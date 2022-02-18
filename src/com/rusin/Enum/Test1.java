package com.rusin.Enum;

public class Test1 {
    void metod(String dayOfWeek) {
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.metod("Sunday");
    }
}
