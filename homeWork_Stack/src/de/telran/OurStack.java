package de.telran;

public interface OurStack<T> {

    void addLast(int elt);

    T removeLast();

    T getLast();

    int size();
}
