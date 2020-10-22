package de.telran.dao;

import de.telran.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public Book[] getBooks() {
        return books;
    }
    //Library library = new Library(60);
    //books -> empty array of Book capacity 60;
    //library.size -> 0

    public int getSize() {
        return size;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBookByAuthor(String author) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                flag = true;
                System.out.println(books[i]);
            }
        }
        if (!flag) {
            System.out.println("book not found");
        }
    }

    public void searchBookByTitle(String title){
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)){
                flag = true;
                System.out.println(books[i]);
            }
        }
        if (!flag){
            System.out.println("book not found");
        }
    }

    public void searchOldestBook(Book[] books) {
        Book oldestBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getDateOfIssue() < oldestBook.getDateOfIssue()) {
                oldestBook = books[i];
            }
        }
        System.out.println("The oldest " + oldestBook);
    }

    public void searchThickestBook(Book[] books) {
        Book thickestBook = books[0];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPage() > thickestBook.getPage()) {
                thickestBook = books[i];
            }
        }
        System.out.println("The thickest " + thickestBook);
    }


    public static void split() {
        System.out.println("-------------");
    }
}
