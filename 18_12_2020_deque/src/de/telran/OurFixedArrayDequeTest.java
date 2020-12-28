package de.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurFixedArrayDequeTest {

    OurFixedArrayDeque<Integer> list = new OurFixedArrayDeque<>(4);

    @Test
    public void testSize_EmptyListZero(){
        assertEquals(0,list.size());
    }

    @Test
    public void testGetFirst_emptyList_DequeOverflowException(){
        assertThrows(DequeOverflowException.class, () -> list.getFirst());
    }

    @Test
    public void testRemoveFirst_emptyList_throwsEmptyDequeException(){
        assertThrows(EmptyDequeException.class, () -> list.removeFirst());
    }

    @Test
    public void testRemoveLast_emptyList_throwsEmptyDequeException(){
        assertThrows(EmptyDequeException.class, () -> list.removeLast());
    }

    @Test
    public void testSizeAndAddFirst_addSeveralElt_correctSize(){
        list.addFirst(1);
        assertEquals(1,list.size());
    }

    @Test
    public void testSizeAndAddLast_addSeveralElt_correctSize(){
        list.addFirst(1);
        list.addLast(3);
        assertEquals(2,list.size());
    }

    @Test
    public void testGetFirstAndLastAndAddFirstAndLast_addSeveralElt(){
        list.addFirst(1);
        list.addLast(3);
        assertEquals(1,list.getFirst());
        assertEquals(3,list.getLast());
    }

    @Test
    public void testRemoveLastAndAddFirstAndLast_addSeveralElt(){
        list.addFirst(1);
        list.addLast(3);
        list.removeLast();
        assertEquals(1,list.getFirst());
       assertEquals(1,list.getLast());
    }

    @Test
    public void testRemoveLast_EmptyDequeException(){
        list.addLast(10);
        list.removeLast();
        assertThrows(EmptyDequeException.class, () -> list.removeLast());
    }

    @Test
    public void testRemoveFirstAndAddFirstAndLast_EmptyDequeException(){
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
}