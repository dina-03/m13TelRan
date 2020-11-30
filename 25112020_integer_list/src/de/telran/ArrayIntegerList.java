package de.telran;

public class ArrayIntegerList implements IntegerList {
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    int[] source;

    public ArrayIntegerList() {
        source = new int[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void addLast(int element) {
        if (size == source.length) {
            increaseCapacity();
        }//source[size++] = element;
        source[size] = element;
        size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        int[] newSource = new int[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        return source[index];
    }

    @Override
    public void set(int index, int value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        source[index] = value;
    }

    @Override
    public int removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        int resRemove = source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        size--;
        return resRemove;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        source = new int[INITIAL_CAPACITY];
        size = 0;
    }
}
