package de.telran;

import java.util.Iterator;

public interface OurList<T> extends Iterable<T> {
    /**
     * Adds the element to the 'this' instance
     *
     * @param element - to add
     */
    void addLast(T element);

    /**
     * @param index - index of the element to return. It must be in the range between 0 and (size-1).
     * @return returns the element by the index
     */
    T get(int index);

    /**
     * sets the value to the index place in the 'this' instance
     *
     * @param index the place to set
     * @param value the value to set
     */
    void set(int index, T value);

    /**
     * removes the element by the index
     *
     * @param index the index of the element to remove
     * @return the value of the removed element
     */
    T removeById(int index);

    /**
     * @return the size of 'this'
     */
    int size();

    /**
     * makes 'this' empty
     */
    void clear();

    /**
     * removes the obj if there is an element in the list which 'equals' to the obj. The method
     * must remove only first such element.
     *
     * @param obj to remove
     * @return true if the object was found and removed, false otherwise
     */
    boolean remove(T obj);

    /**
     * @param obj to check
     * @return true if the obj is present in this list (according to the method 'equals')
     */
    boolean contains(T obj);

    /**
     * @return iterator object which iterates from the beginning to the end of the list
     */
    Iterator<T> forwardIterator();

    /**
     * @return iterator object which iterates from the end to the beginning of the list
     */
    Iterator<T> backwardIterator();
}
