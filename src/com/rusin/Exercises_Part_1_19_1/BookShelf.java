package com.rusin.Exercises_Part_1_19_1;

import java.util.*;

public class BookShelf {
    private List<Book> books = new ArrayList<>();
    //in cm
    private int shelfWidth = 2000;
    //in cm
    private int freeSpaceWidth = 2000;
    private int busySpace;

    public boolean addBook(Book book) {
        if (freeSpaceWidth >= book.getWidth()) {
            books.add(book);
            freeSpaceWidth -= book.getWidth();
            busySpace += book.getWidth();
            return true;
        }
        return false;
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
