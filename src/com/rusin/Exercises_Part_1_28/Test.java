package com.rusin.Exercises_Part_1_28;

public class Test {
    public static void main(String[] args) {
        LibraryDatabase booksBase = new LibraryDatabase();
        Book book1 = new Book("ABC", 100, "Bulko A.B.", "education", 9723344227469L );
        Book book2 = new Book("The jungle book", 300, "Rudyard Kipling", "storybook",9780194227469L);
        Book book3 = new Book("Master and Margarita", 600, "Bulgakov M.A.", "novel",9700000027469L);

        booksBase.bookAdd(book1);
        booksBase.bookAdd(book2);
        booksBase.bookAdd(book3);
        booksBase.findAll();
//        booksBase.findByTitle("ABC");
//        booksBase.findByAuthor("Bulgakov M.A.");
//        booksBase.findByPages(300);
//        booksBase.findByISBN(9723344227469L);


    }
}
