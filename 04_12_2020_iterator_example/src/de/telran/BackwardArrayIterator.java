package de.telran;

import java.util.Iterator;

public class BackwardArrayIterator implements Iterator<Integer> {

    private int currentIndex;
    private int[] source;

    public BackwardArrayIterator(int[] source) {
        this.source = source;
        currentIndex = source.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Integer next() {
        return source[currentIndex--];
    }
}
