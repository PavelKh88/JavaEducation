package com.rusin.Exercises_Part_1_19_1;

public class Test {

    public static void main(String[] args) {
        BookShelf bookShelf1 = new BookShelf();
        Book b1 = new Book("Maugli" , 40, 500);
        Book b2 = new Book("ABC", 20, 60);
        bookShelf1.addBook(b1);
        bookShelf1.addBook(b2);
        Book b3 = new Book("Voina i Myr", 1000, 5000);
        bookShelf1.addBook(b3);
        System.out.println(bookShelf1);
        Book b4 = new Book("War II", 1000, 4000);
        if (!bookShelf1.addBook(b4)) {

        }


    }
}
