package de.telran.application;

import de.telran.dao.Library;
import de.telran.data.Book;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Joan Rollings", 2005, 435);
        Book book2 = new Book("Winnie the Pooh", "Alex Milan", 1957, 256);
        Book book3 = new Book("Sherlock Holms", "Artur Conan Doyle", 1892, 388);
        Book book4 = new Book("Little prince", "Antoine de Saint-Exupéry", 1938, 300);
        Book book5 = new Book("Bible", "God", 1900, 1346);

        Library myLib = new Library(100);
        System.out.println(myLib.getSize());
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        myLib.addBook(book5);
        System.out.println(myLib.getSize());
        myLib.display();
        myLib.addBook(new Book("War and Peace", "Lev Tolstoy", 1886, 678));
        System.out.println(myLib.getSize());
        System.out.println(" ");
        myLib.deleteBook(book1);
        book1 = new Book("War and Peace", "Lev Tolstoy", 1886, 678);
        myLib.display();

        Book[] books = {book1, book2, book3, book4, book5};

        Library.split();
        myLib.searchBookByAuthor("Alex Milan");
        myLib.searchBookByAuthor("Alan Pool");
        Library.split();
        myLib.searchBookByTitle("Bible");
        myLib.searchBookByTitle("War and Peace");
        myLib.searchBookByTitle("War");
        Library.split();
        myLib.searchOldestBook(books);
        Library.split();
        myLib.searchThickestBook(books);

    }
}
