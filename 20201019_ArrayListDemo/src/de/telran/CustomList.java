package de.telran;

// add element
// delete element
//dynamic changing size
// update, search
//get element
public interface CustomList<E> {
    int size();

    void add(E o);

    E get(int index);

    E removeById(int index);

    boolean remove(E e);
   
}
