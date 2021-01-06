package de.telran;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class OurArrayList<T> implements OurList<T> {
    private static final int INITIAL_CAPACITY = 16;

    private int size;
    private Object[] source;

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(T element) {
        if (size == source.length)
            increaseCapacity();

//        source[size++] = element;
        source[size] = element;
        size++;
    }

    // O(n), where n is size
    void increaseCapacity() {
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    // O(1) - the number of operations is never dependant on the number of elements in the list
    public T get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return (T) source[index];
    }

    @Override
    // O(1) - the number of operations is never dependant on the number of elements in the list
    public void set(int index, T value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        source[index] = value;
    }

    @Override
    // O(n), where n is size
    public T removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        T res = (T) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        source[size - 1] = null;
        size--;
        return res;
    }

    @Override
    // O(1)
    public int size() {
        return size;
    }

    @Override
    // O(1)
    public void clear() {
        source = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    // O(n) - to find the needle. And O(n) - to remove it by its index
    // total number of operations is O(n)
    public boolean remove(T obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null) {
                    removeById(i);
                    return true;
                }
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (obj.equals(source[i])) {
                removeById(i);
                return true;
            }
        }
        return false;
    }

    @Override
    // O(n) - to find the needle.
    public boolean contains(T obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null)
                    return true;
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (obj.equals(source[i]))
                return true;
        }
        return false;
    }

    @Override
    // O(n) is the complexity of using the iterator
    public Iterator<T> forwardIterator() {
        Iterator<T> iterator = new ForwardIterator();
        return iterator;
    }

    @Override
    public Iterator<T> backwardIterator() {
        Iterator<T> iterator = new BackwardIterator<>((T[]) source, size);
        return iterator;
    }

    @Override
    public Iterator<T> iterator() {
        return forwardIterator();
    }

    private class ForwardIterator implements Iterator<T> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (currentIndex >= size)
                throw new IndexOutOfBoundsException();

            T res = (T) source[currentIndex];
            currentIndex++;
            return res;
        }
    }

    private static class BackwardIterator<O> implements Iterator<O> {
        int currentIndex;
        O[] source;

        public BackwardIterator(O[] source, int size) {
            this.source = source;
            currentIndex = size - 1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public O next() {
            if (currentIndex < 0)
                throw new IndexOutOfBoundsException();

            O res = source[currentIndex];
            currentIndex--;
            return res;
        }
    }

    @Override
    public int sort(Comparator<T> comparator) {
        Object[] copy = new Object[size];

        int i = 0;
        for (T elt : this) {
            copy[i++] = elt;
        }

        for (int j = 0; j < copy.length; j++) {
            for (int k = 1; k < copy.length - j; k++) {
                if (comparator.compare(get(k-1),get(k) ) > 0){
                    Object temp = copy[k - 1];
                    copy[k - 1] = copy[k];
                    copy[k] = temp;
                }
            }
        }

        this.clear();
        for (Object elt : copy) {
            this.addLast((T) elt);
        }
        return i;
    }
}
