package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String title = parts[0];
            String author = parts[1];
            library.addBook(new Book(title, author));
        }

        int m = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < m; i++) {
            String title = sc.nextLine();
            library.borrowBook(title);
        }
        sc.close();
    }
}
