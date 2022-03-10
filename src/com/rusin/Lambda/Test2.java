package com.rusin.Lambda;

public class Test2 {
   void def (I i) {
     System.out.println(i.abc("privet"));
 }

    public static void main(String[] args) {
//        def((String str) -> {return "Poka";});
    Test2 test2 = new Test2();
    test2.def((String str ) -> {return "Kak Dela";});
 }
}

interface I {
    String abc(String s);
}