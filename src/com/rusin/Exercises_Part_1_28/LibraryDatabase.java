package com.rusin.Exercises_Part_1_28;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void bookAdd(Book book) {
        books.add(book);
    }

    public void findAll() {
        for (Book book : books) {
            System.out.println("Book located by index " + books.indexOf(book) + " " + book);
        }
    }

    public void findByTitle(String title) {
        for (Book book : books) {
            if(book.getTitle() == title) {
                System.out.println("Book located by index " + books.indexOf(book) + " " + book);
            }
        }
    }

    public void findByPages(int pages) {
        for (Book book : books) {
            if(book.getPages() == pages) {
                System.out.println("Book located by index " + books.indexOf(book) + " " + book);
            }
        }
    }

    public void findByAuthor(String author) {
        for (Book book : books) {
            if(book.getAuthor() == author) {
                System.out.println("Book located by index " + books.indexOf(book) + " " + book);
            }
        }
    }

    public void findByCategory(String category) {
        for (Book book : books) {
            if(book.getCategory() == category) {
                System.out.println("Book located by index " + books.indexOf(book) + " " + book);
            }
        }
    }

    public void findByISBN(long isbn) {
        for (Book book : books) {
            if(book.getIsbn() == isbn) {
                System.out.println("Book located by index " + books.indexOf(book) + " " + book);
            }
        }
    }

    @Override
    public String toString() {
        return "LibraryDatabase{" +
                "books=" + books +
                '}';
    }
}
