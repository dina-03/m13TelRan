package de.telran;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayIntegerListTest {
    ArrayIntegerList ail = new ArrayIntegerList();

    @Test
    public void testGet_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(10));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(-10));
    }

    @Test
    public void testRemove_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(10));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(-10));
    }

    @Test
    public void testSet_emptyList_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> ail.set(0, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.set(10, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.set(-10, 0));
    }

    @Test
    public void testAddLast() {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ail.get(0);
        });
    }

    @Test
    public void testAddLast_Equals() {
        int[] arr = {1, 2, 3};
        for (int a : arr) {
            ail.addLast(a);
        }
        assertEquals(3, ail.get(2));
    }

    @Test
    public void testAddLAst_Equals_Two() {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
        Assert.assertEquals(3, ail.size());
    }

    @Test
    public void increaseCapacity() {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
        Assert.assertEquals(3, ail.size());
    }

    @Test
    public void get() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ail.get(0);
        });
    }

    @Test
    public void set() {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
        ail.addLast(4);
        ail.addLast(5);
        ail.set(1, 7);
        ail.set(2, 8);
        assertEquals(7, ail.get(1));
        assertEquals(8, ail.get(2));
    }

    @Test
    public void removeById() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int a : arr) {
            ail.addLast(a);
        }
        int actualDeletedNumber = ail.removeById(4); // 4
        int[] expected = {1, 2, 3, 5};
        assertEquals(5, actualDeletedNumber);
    }

    @Test
    public void testSizeZero() {
        Assert.assertEquals(0, ail.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] arr = {1, 2, 3};
        for (int a : arr) {
            ail.addLast(a);
        }
        Assert.assertEquals(3, ail.size());
    }

    @Test
    public void testSizeAndAddLast_addSeveralElements_correctSize() {
        ail.addLast(1);
        ail.addLast(1);
        ail.addLast(1);
        assertEquals(3, ail.size());
    }

    @Test
    public void testGetAndAddLast_addSeveralElements_correctOrderOfElements() {
        int[] numbers = {1, 2, 3, 4, 5, -7, 10};
        for (int number : numbers) {
            ail.addLast(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(numbers[i], ail.get(i));
        }
    }

    @Test
    public void testAddLast_addInitialCapacityPlusElements_correctSizeAndCapacity() {
        //  int[] numbers = {1, 2, 3, 4, 5, -7, 10, 8, 9, 12, -22, 14, 15, 16, 18, 17, 19};
        for (int i = 0; i < 17; i++) {
            ail.addLast(i);
        }
        assertEquals(17, ail.size());
        assertEquals(32, ail.source.length);
    }

    @Test
    public void testRemoveById_addSeveralElementsAndRemoveLast_correct() {
        int[] numbers = {1, 2, 3, 4, 5, -7, 10, 20};
        for (int number : numbers) {
            ail.addLast(number);
        }
        assertEquals(20, ail.removeById(7));
        assertEquals(7, ail.size());
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(7));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.set(7, 100));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.removeById(7));
    }

    @Test
    public void testRemoveById_addCapacityNumberElementsAndRemoveLast_correct() {
        for (int i = 0; i < 16; i++) {
            ail.addLast(i);
        }
        assertEquals(15, ail.removeById(15));
        assertEquals(15, ail.size());
        assertThrows(IndexOutOfBoundsException.class, () -> ail.get(15));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.set(15, 100));
        assertThrows(IndexOutOfBoundsException.class, () -> ail.removeById(15));
    }

    @Test
    public void testClear_addSeveralElementsAndClearAll_correct() {
        int[] numbers = {1, 2, 3, 4, 5, -7, 10, 20};
        for (int number : numbers) {
            ail.addLast(number);
            ail.clear();
        }
        assertEquals(0, ail.size());
    }

    @Test
    public void testClear_emptyList() {
        ail.clear();
        assertEquals(0, ail.size());
    }

    @Test
    public void testRemoveZeroIndexElement_correct() {
        for (int i = 0; i < 16; i++) {
            ail.addLast(i);
        }
        assertEquals(0, ail.removeById(0));
    }

    @Test
    public void testRemoveMiddleElement_correct() {
        int[] numbers = {1, 2, 4, 7, 9, 8, 11};
        int middle = numbers.length / 2;
        for (int i = 0; i < numbers.length; i++) {
            ail.addLast(i);
        }
        assertEquals(3, ail.removeById(middle));
    }

    @Test
    public void testRemoveByIdElement_addCapacityNumberElementsAndRemoveIntermediate_correct() {
        for (int i = 0; i < 18; i++) {
            ail.addLast(i);
        }
        assertEquals(5, ail.removeById(5));
        assertEquals(17, ail.size());

        for (int i = 0; i < 5; i++) {
            assertEquals(i, ail.get(i));
        }
        for (int i = 5; i < ail.size(); i++) {
            assertEquals(i + 1, ail.get(i));
        }
    }

    @Test
    public void testRemoveByIdElement_setToFirstIndex_correct() {
        addElementsToList(5);
        ail.set(0, 100098);
        assertEquals(100098, ail.get(0));
    }

    @Test
    public void testRemoveByIdElement_setToLastIndex_correct() {
        addElementsToList(5);
        ail.set(ail.size() - 1, 400);
        assertEquals(400, ail.get(ail.size() - 1));
    }

    @Test
    public void testRemoveByIdElement_setToIndexBetweenFirstAndLast_correct() {
        int numberOfElements = 20;
        addElementsToList(numberOfElements);
        ail.set(17, 3030);
        assertEquals(3030, ail.get(17));
    }

    @Test
    public void testUniversal_addSeveralElementsThenSetThenRemove_etc() {
        addElementsToList(4);
        ail.removeById(2);//{0,1,3}
        ail.set(1, 5);//{0,5,3}
        ail.addLast(-10);//{0,5,3,-10}
        ail.addLast(-15);//{0,5,3,-10,-15}
        ail.removeById(2);//{0,5,-10,-15}
        ail.removeById(0);//{5,-10,-15}
        assertEquals(3, ail.size());
        assertEquals(5, ail.get(0));
        assertEquals(-10, ail.get(1));
        assertEquals(-15, ail.get(2));
    }

    private void addElementsToList(int number) {
        for (int i = 0; i < number; i++) {
            ail.addLast(i);
        }
    }
}