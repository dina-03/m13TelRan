package telran;

import org.junit.Ignore;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {
    OurList<Integer> list = new OurLinkedList<>();
    OurLinkedList<String> linkedList = new OurLinkedList<>();

    @org.junit.jupiter.api.Test
    void testGetLast_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-10));
    }

    @org.junit.jupiter.api.Test
    void testAddLast_Equals() {
        int[] arr = {1, 2, 4, 3, 7};
        for (int a : arr) {
            list.addLast(a);
        }
        assertEquals(7, list.get(4));
        assertEquals(4, list.get(2));
    }

    @org.junit.jupiter.api.Test
    void testAddLast_Equals_AddElementsAlternately() {
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(8);
        list.addLast(10);
        assertEquals(5, list.get(2));
        assertEquals(10, list.get(4));
        assertEquals(5, list.size());
    }

    @org.junit.jupiter.api.Test
    void testAddLast_IncreaseCapacity() {
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(8);
        list.addLast(10);
        assertEquals(5, list.size());
    }

    @org.junit.jupiter.api.Test
    void testSet_Equals_AddElementsAlternately() {
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(8);
        list.addLast(10);
        list.set(1, 11);
        list.set(4, 88);
        assertEquals(11, list.get(1));
        assertEquals(88, list.get(4));
    }

    @org.junit.jupiter.api.Test
    void testRemoveById_addSeveralElementsAndRemoveLast() {
        int[] arr = {1, 2, 4, 3, 7, -10};
        for (int a : arr) {
            list.addLast(a);
        }
        assertEquals(-10, list.removeById(5));
        assertEquals(5, list.size());
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(5, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(5));
    }

    @org.junit.jupiter.api.Test
    void testRemoveById_addSeveralElementsAndRemoveFirst() {
        int[] arr = {1, 2, 4, 3, 7, -10};
        for (int a : arr) {
            list.addLast(a);
        }
        assertEquals(1, list.removeById(0));
        assertEquals(5, list.size());
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(5, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(5));
    }

    @org.junit.jupiter.api.Test
    void testRemoveById_addCapacityNumberElementsAndRemoveLast() {
        for (int i = 0; i < 17; i++) {
            list.addLast(i);
        }
        assertEquals(16, list.removeById(16));
        assertEquals(16, list.size());
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(16));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(16, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeById(16));
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void testClear_addSeveralElementsAndClearAll() {
        int[] arr = {1, 2, 4, 3, 7, -10};
        for (int a : arr) {
            list.addLast(a);
            list.clear();
        }
        assertEquals(0, list.size());
    }

    @org.junit.jupiter.api.Test
    void testRemoveMiddleElement() {
        int[] arr = {1, 2, 4, 3, 7, -10};
        int middle = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            list.addLast(i);
        }
        assertEquals(3, list.removeById(middle));
        assertEquals(4, list.removeById(middle));
    }

    @org.junit.jupiter.api.Test
    void testRemoveByIdElement_addCapacityNumberElementsAndRemoveIntermediate() {

        for (int i = 0; i < 20; i++) {
            list.addLast(i);
        }
        assertEquals(5, list.removeById(5));
        assertEquals(19, list.size());
    }

    @org.junit.jupiter.api.Test
    void testRemoveByIdElement_setToFirstIndex() {
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        list.set(0, 125);
        assertEquals(125, list.get(0));
    }

    @org.junit.jupiter.api.Test
    void testRemoveByIdElement_setToLastIndex() {
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        list.set(list.size() - 1, 250);
        assertEquals(250, list.get(list.size() - 1));
    }

    @org.junit.jupiter.api.Test
    void testContains_checkIfTheItemIsInTheList() {
        int[] arr = {1, 2, 4, 3, 7, -10};
        for (int a : arr) {
            list.addLast(a);
        }
        assertFalse(list.contains(8));
        assertTrue(list.contains(-10));
        assertTrue(list.contains(7));
    }
}