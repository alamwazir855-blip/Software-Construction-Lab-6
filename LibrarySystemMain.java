package com.mycompany.lab6;

public class LibrarySystemMain {

    public static void main(String[] args) {

        LibrarySystem library = new LibraryImplementation();

        library.addBook("B001", "Java Programming", "James Gosling");
        library.addBook("B002", "Software Engineering", "Ian Sommerville");

        System.out.println(library.searchBook("B001"));

        library.issueBook("B001");
        System.out.println(library.searchBook("B001"));

        library.returnBook("B001");
        System.out.println(library.searchBook("B001"));

        library.removeBook("B002");
        System.out.println(library.searchBook("B002"));
    }
}