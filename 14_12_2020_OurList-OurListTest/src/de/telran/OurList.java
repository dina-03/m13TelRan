package de.telran;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public interface OurList<T> extends Iterable<T> {
    /**
     * Adds the element to the 'this' instance
     *
     * @param element
     *         - to add
     */
    void addLast(T element);

    /**
     * @param index
     *         - index of the element to return. It must be in the range between 0 and (size-1).
     * @return returns the element by the index
     */
    T get(int index);

    /**
     * sets the value to the index place in the 'this' instance
     *
     * @param index
     *         the place to set
     * @param value
     *         the value to set
     */
    void set(int index, T value);

    /**
     * removes the element by the index
     *
     * @param index
     *         the index of the element to remove
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
     * @param obj
     *         to remove
     * @return true if the object was found and removed, false otherwise
     */
    boolean remove(T obj);

    /**
     * @param obj
     *         to check
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

    /**
     * sorts the list according to the 'comparator' rule
     *
     * @param comparator
     *         the rule to sort the list
     * @return
     */
    default int sort(Comparator<T> comparator) {
        Object[] copy = new Object[size()];

        int i = 0;
        for (T elt : this) {
            copy[i++] = elt;
        }

        /*for (int j = 0; j < copy.length; j++) {
            for (int k = 1; k < copy.length - j; k++) {
                if (comparator.compare(get(k-1),get(k) ) > 0){
                    Object temp = copy[k - 1];
                    copy[k - 1] = copy[k];
                    copy[k] = temp;
                }
            }
        }*/
        for (int j = 0; j < size(); j++) {
            int minId = j;
            for (int k = j; k < size(); k++) {
                if (comparator.compare((T) copy[minId], (T) copy[k]) > 0) {
                    minId = k;
                }
            }
            Object temp = copy[j];
            copy[j] = copy[minId];
            copy[minId] = temp;
        }

        this.clear();
        for (Object elt : copy) {
            this.addLast((T) elt);
        }
        return i;
    }

    default T max(Comparator<T> comparator) {
        if (size() == 0)
            throw new NoSuchElementException();

        Iterator<T> iterator = iterator();

        /*T max = iterator.next();          -> первый вариант
        while (iterator.hasNext()) {
            T currentElt = iterator.next();
            if (comparator.compare(currentElt, max) > 0)
                max = currentElt;
        }*/

        T max = this.get(0);
        for (T currentElt : this) {
            if (comparator.compare(currentElt, max) > 0)
                max = currentElt;
        }
        return max;
    }

    /**
     * The method uses the natural ordering of the element inside the list.
     * Meaning the elements must be Comparable
     *
     * @return max according to the natural ordering
     */

    default T max() {
        if (size() == 0)
            throw new NoSuchElementException();

        T max = this.get(0);
        for (T currentElt : this) {
            Comparable<T> compCurrentElement = (Comparable<T>) currentElt;
            if (compCurrentElement.compareTo(max) > 0)
                max = currentElt;
        }
        return max;
    }

    default T min(Comparator<T> comparator) {
        return max(comparator.reversed());
    }

    default T min() {
        Comparator<T> comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Comparable<T> comparable01 = (Comparable<T>) o1;
                return comparable01.compareTo(o2);
            }
        };

        /*T min = this.get(0);
        for (T currentElt : this) {
            Comparable<T> compCurrentElement = (Comparable<T>) currentElt;
            if (compCurrentElement.compareTo(min) < 0)
                min = currentElt;
        }*/
        return min(comparator);
    }

    default void sort() {
        Comparator<T> comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Comparable<T> comparable01 = (Comparable<T>) o1;
                return comparable01.compareTo(o2);
            }
        };
        sort(comparator);
    }
}
