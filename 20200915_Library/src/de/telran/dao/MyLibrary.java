package de.telran.dao;

import de.telran.data.Book;

import java.util.ArrayList;
import java.util.List;

public class MyLibrary {
    private List<Book> library;

    public MyLibrary() {
        library = new ArrayList<>();
    }

    public List<Book> getLibrary() {
        return library;
    }

    public MyLibrary(List<Book> library) {
        this.library = library;
    }
}
