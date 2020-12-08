package telran;

import java.util.Iterator;

public class OurArrayList<T> implements OurList<T> {
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    private Object[] source;

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(T element) { // O(n)
        if (element == null)
            throw new IndexOutOfBoundsException();

        if (size == source.length) {
            increaseCapacity();
        }//source[size++] = element;
        source[size] = element;
        size++;
    }

    void increaseCapacity() { //O(n)
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public T get(int index) { //O(n)
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        return (T) source[index];
    }

    @Override
    public void set(int index, T value) { //O(n)
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        source[index] = value;
    }

    @Override
    public T removeById(int index) { //O(n)
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        T resRemove = (T) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        source[size - 1] = null;
        size--;
        return resRemove;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() { //O(1)
        source = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean remove(T obj) { //O(n^2)
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
    public boolean contains(T obj) { //O(n^2)
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null) {
                    return true;
                }
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
    public Iterator<T> forwardIterator() { //O(1)
        Iterator iterator = new ForwardIterator();
        return iterator;
    }

    @Override
    public Iterator<T> backwardIterator() { //O(1)
        Iterator<T> iterator = new BackwardIterator<>((T[]) source, size);
        return iterator;
    }

    private class ForwardIterator implements Iterator<T> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() { //O(n)
            if (currentIndex >= size)
                throw new IndexOutOfBoundsException();
            T res = (T) source[currentIndex];
            currentIndex++;
            return res;
        }
    }

   /* private class BackwardIterator implements Iterator<T> {

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
            currentIndex--;
            return res;
        }
    }*/

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
        public O next() { //O(n)
            if (currentIndex < 0)
                throw new IndexOutOfBoundsException();
            O res = source[currentIndex];
            currentIndex--;
            return res;
        }
    }
}
