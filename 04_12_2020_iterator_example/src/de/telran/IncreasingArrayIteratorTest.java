package de.telran;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingArrayIteratorTest {
    @org.junit.jupiter.api.Test
    void testIterator_emptyArray_nothing() {
        int[] array = {};
        int[] res = iterateToArray(array);
        assertArrayEquals(new int[]{}, res);
    }

    @Test
    void testIterator_oneElements() {
        int[] array = {7};
        int[] res = iterateToArray(array);
        assertArrayEquals(new int[]{7}, res);
    }

    @Test
    void testIterator_severalElements() {
        int[] array = {1, 12, 43, -12, -1};
        int[] res = iterateToArray(array);
        assertArrayEquals(new int[]{-12, -1, 1, 12, 43}, res);
        assertArrayEquals(new int[]{1, 12, 43, -12, -1}, array);
    }

    private int[] iterateToArray(int[] array) {
        int[] res = new int[array.length];
        Iterator<Integer> iterator = new IncreasingArrayIterator(array);
        int i = 0;
        while (iterator.hasNext()) {
            res[i++] = iterator.next();
        }
        return res;
    }
}