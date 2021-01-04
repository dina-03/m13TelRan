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
        if (size == capacity) {
            throw new DequeOverflowException();
        }
       /* firstEltId = capacity - 1;
        firstEltId = (firstEltId - 1) % capacity;
        source[firstEltId] = elt;
        size++;*/

        // -1 % 3 -> -1
        if (firstEltId > 0)
            firstEltId--;
        else
            firstEltId = capacity - 1;

        source[firstEltId] = elt;
        size++;
    }

    @Override
    public T getFirst() {
        //if (firstEltId >= size || firstEltId < 0)
        if (size == 0)
            throw new EmptyDequeException();
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
        if (size == capacity) {
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
