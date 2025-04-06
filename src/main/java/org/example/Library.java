package org.example;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void borrowBook(String title) {
        Book book = books.get(title);

        if (book == null) {
            System.out.println("Book not found: " + title);
        } else if (!book.isAvailable()) {
            System.out.println("Already Borrowed: " + title);
        } else {
            book.borrowBook();
            System.out.println("Borrowed: " + title);
        }
    }

    public void returnBook(String title) {
        Book book = books.get(title);

        if (book == null) {
            System.out.println("Book not found: " + title);
        } else if (!book.isAvailable()) {
            System.out.println("Already Borrowed: " + title);
        } else {
            book.returnBook();
            System.out.println("Book Returned: " + title);
        }
    }

    public void listAvailableBooks() {
        boolean found = false;
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books");
        }
    }
}
