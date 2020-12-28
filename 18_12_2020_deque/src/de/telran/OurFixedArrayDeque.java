package de.telran;

import java.util.Deque;

public class OurFixedArrayDeque<T> implements OurDeque<T> {
    private int firstEltId;
    private int size;
    private Object[] source;
    private int capacity;

    public OurFixedArrayDeque(int initialCapacity) {
        this.source = new Object[initialCapacity];
        this.capacity = source.length;
    }

    @Override
    public void addFirst(T elt) {
        if (size == source.length) {
            throw new DequeOverflowException();
        }
        int index = (firstEltId) % capacity;
        source[index] = elt;
        size++;
    }

    @Override
    public T getFirst() {
        if (firstEltId >= size || firstEltId < 0)
            throw new DequeOverflowException();
        return (T) source[firstEltId];
    }

    @Override
    public T removeFirst() {
        if (size == 0) {
            throw new EmptyDequeException();
        }
        T res = (T) source[firstEltId];
        source[firstEltId] = null;
        firstEltId = (firstEltId + 1) % capacity;
        size--;
        return res;
    }

    @Override
    public void addLast(T elt) {
        if (size == source.length) {
            throw new DequeOverflowException();
        }
        int index = (firstEltId + size) % capacity;
        source[index] = elt;
        size++;
    }

    @Override
    public T getLast() {
        if (size == 0) {
            throw new EmptyDequeException();
        }
        int lastIndex = (firstEltId + size - 1) % capacity;
        return (T) source[lastIndex];
    }

    @Override
    public T removeLast() {
        if (size == 0) {
            throw new EmptyDequeException();
        }
        int lastIndex = (firstEltId + size - 1) % capacity;
        T res = (T) source[lastIndex];
        source[lastIndex] = null;
        size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }
}
