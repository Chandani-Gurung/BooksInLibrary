package org.encap;

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

        System.out.println("Enter commands: borrow [title], return [title], list, exit");

        while (true) {
            String line = sc.nextLine();
            if (line.equals("exit")) break;

            String[] parts = line.split(" ", 2);
            String command = parts[0];

            switch (command) {
                case "borrow":
                    library.borrowBook(parts[1]);
                    break;
                case "return":
                    library.returnBook(parts[1]);
                    break;
                case "list":
                    library.listAvailableBooks();
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }

        sc.close();
    }
}
