package com.rusin.Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vvedite Chislo:");
//        int a = scanner.nextInt();
//        System.out.println("Vi Vveli " + a);
//        System.out.println("Vvedite 2 chisla: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println("Chastnoe = " + a / b);
//        System.out.println("Ostatok = " + a % b);
//        System.out.println("Vvedite paru Strok");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println("Vi vveli : " + s1 + " Pervoya stroka ");
//        System.out.println("Vi vveli : " + s2 + " Vtoraya stroka stroka");
//        System.out.println("Vvedite Drobnoe chislo");
//        double d = scanner.nextDouble();
//        System.out.println("Vi vveli : " + d);
        Scanner scanner = new Scanner("Privet moy drug \n Kak pojivaesh? " +
                                        "\n Chto horoshego?");
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
}

