//package com.company;
//
//public class erorr1 {
//
//    public static void main (String args[])
//            throws java.io.IOException {
//
//        char choise, ignore;
//        for (; ; ) {
//            do {
//                System.out.println("1.if");
//                System.out.println("2.swich");
//                System.out.println("3.for");
//                System.out.println("4.while");
//                System.out.println("5.do-while");
//                System.out.println("6.break");
//                System.out.println("7.continue\n");
//                System.out.println("q-exit:");
//
//                choise = (char) System.in.read();
//
//                do {
//                    ignore = (char) System.in.read();
//                } while (ignore != '\n');
//
//
//            } while (choise < '1' | choise > '7' & choise != 'q');
//
//            if (choise == 'q') ;
//
//            System.out.println("\n");
//
//            switch (choise) {
//
//                case '1':
//                    System.out.println("if:");
//                    System.out.println("if(condition)instruction");
//                    System.out.println("else instruction");
//                    break;
//                case '2':
//                    System.out.println("instruction switch:\n");
//                    System.out.println("switch (expression){");
//                    System.out.println(" case constant:");
//                    System.out.println("subsquence instruction");
//                    System.out.println("break");
//                    System.out.println("//...");
//                    System.out.println("}");
//                    break;
//            }
//
//            System.out.println();
//
//        }
//    }
//}
