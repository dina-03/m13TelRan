package de.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurFixedArrayDequeTest {

    OurFixedArrayDeque<Integer> list = new OurFixedArrayDeque<>(4);

    @Test
    public void testSize_EmptyListZero() {
        assertEquals(0, list.size());
    }

    @Test
    public void testGetFirst_emptyList_EmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> list.getFirst());
    }

    @Test
    public void testRemoveFirst_emptyList_throwsEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> list.removeFirst());
    }

    @Test
    public void testRemoveLast_emptyList_throwsEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> list.removeLast());
    }

    @Test
    public void testSizeAndAddFirst_addSeveralElt_correctSize() {
        list.addFirst(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testSizeAndAddLast_addSeveralElt_correctSize() {
        list.addFirst(1);
        list.addLast(3);
        assertEquals(2, list.size());
    }

    @Test
    public void testGetFirstAndLastAndAddFirstAndLast_addSeveralElt() {
        list.addFirst(1);
        list.addLast(3);
        assertEquals(1, list.getFirst());
        assertEquals(3, list.getLast());
    }

    @Test
    public void testRemoveLastAndAddFirstAndLast_addSeveralElt() {
        list.addFirst(1);
        list.addLast(3);
        list.removeLast();
        assertEquals(1, list.getFirst());
        assertEquals(1, list.getLast());
    }

    @Test
    public void testRemoveLast_EmptyDequeException() {
        list.addLast(10);
        list.removeLast();
        assertThrows(EmptyDequeException.class, () -> list.removeLast());
    }

    @Test
    public void testRemoveFirstAndAddFirstAndLast_EmptyDequeException() {
        list.addFirst(10);
        list.removeFirst();
        assertThrows(EmptyDequeException.class, () -> list.removeFirst());
    }

    @Test
    public void testAddLast_throwsDequeOverflowException() {
        list.addLast(12);
        list.addLast(-5);
        list.addLast(7);
        list.addLast(10);
        assertEquals(4, list.size());
        assertThrows(DequeOverflowException.class, () -> list.addLast(33));
    }

    @Test
    public void testAddFirst_throwsDequeOverflowException() {
        list.addFirst(12);
        list.addFirst(-5);
        list.addFirst(7);
        list.addFirst(10);
        assertEquals(4, list.size());
        assertThrows(DequeOverflowException.class, () -> list.addFirst(33));
    }

    // tests от Марии-----------------------------------------------------------
    @Test
    void testSize_emptyList_zero() {
        assertEquals(0, list.size());
    }

    @Test
    void testGetFirst_emptyList_throwsEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            list.getFirst();
        });
    }

    @Test
    void testGetLast_emptyList_throwsEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            list.getLast();
        });
    }

    @Test
    void testRemoveFirst2_emptyList_throwsEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            list.removeFirst();
        });
    }

    @Test
    void testRemoveLast2_emptyList_throwsEmptyDequeException() {
        assertThrows(EmptyDequeException.class, () -> {
            list.removeLast();
        });
    }

    @Test
    void testSizeAndAddLast_addSeveralElements_correctSize() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals(3, list.size());
    }

    @Test
    void testSizeAndAddFirst_addSeveralElements_correctSize() {
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.size());
    }

    @Test
    void testGetLastAndAddLast_addSeveralElements_correctOrderOfElements() {
        int[] numbers = new int[]{0, 1, 2};
        for (int i = 0; i < 3; i++) {
            list.addLast(i);
            assertEquals(numbers[i], list.getLast());
        }
    }

    @Test
    void testGetFirstAndAddFirst_addSeveralElements_correctOrderOfElements() {
        int[] numbers = new int[]{0, 1, 2};
        for (int i = 0; i < 3; i++) {
            list.addFirst(i);
            assertEquals(numbers[i], list.getFirst());
        }
    }

    @Test
    void testGetFirstAndAddFirst_GetLastAndAddLast_correctOrderOfElements() {
        //int[] numbers = new int[]{10, 100,  0};
        list.addFirst(10);
        list.addLast(100);
        list.addLast(0);
        assertEquals(10, list.getFirst());
        assertEquals(0, list.getLast());
    }

    @Test
    void testAddFirst2_throwsDequeOverflowException() {
        list.addFirst(12);
        list.addFirst(12);
        list.addFirst(12);
        list.addFirst(12);
        assertThrows(DequeOverflowException.class, () -> list.addFirst(33));
    }

    @Test
    void testAddLast2_throwsDequeOverflowException() {
        list.addLast(10);
        list.addLast(-55);
        list.addLast(3);
        list.addLast(1);
        assertEquals(4, list.size());
        assertThrows(DequeOverflowException.class, () -> list.addLast(33));
    }

    @Test
    public void testRemoveLastSeveralTimes_throwsEmptyDequeException() {
        list.addLast(10);
        list.removeLast();
        assertThrows(EmptyDequeException.class, () -> list.removeLast());
    }

    @Test
    public void testRemoveFirstSeveralTimes_throwsEmptyDequeException() {
        list.addFirst(101);
        list.removeFirst();
        assertThrows(EmptyDequeException.class, () -> list.removeFirst());
    }
}