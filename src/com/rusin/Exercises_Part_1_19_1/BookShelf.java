package com.rusin.Exercises_Part_1_19_1;

import java.util.*;

public class BookShelf {
    private List<Book> books = new ArrayList<>();
    private int shelfWidth = 2000;
    private int freeSpaceWidth = 2000;
    private  int busySpace;

    public void addBook(Book book) {
        if(freeSpaceWidth >= book.getWidth()) {
            books.add(book);
            freeSpaceWidth -= book.getWidth();
            busySpace += book.getWidth();
        }
        else {
            System.out.println("no free space to add a book !!!");
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                ", shelfWidth=" + shelfWidth +
                ", freeSpaceWidth=" + freeSpaceWidth +
                ", busySpace=" + busySpace +
                '}';
    }
}
