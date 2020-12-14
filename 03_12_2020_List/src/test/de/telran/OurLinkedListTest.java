package test.de.telran;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import telran.OurLinkedList;
import telran.OurList;

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

    @Test
    void testRemove_RemoveFirst() {
        for (int i = 0; i < 16; i++) {
            linkedList.addLast("symbol " + i);
        }

        assertTrue(linkedList.remove("symbol 0"));
        assertEquals(15, linkedList.size());
        assertEquals("symbol 15", linkedList.get(14));

        for (int i = 1; i < linkedList.size(); i++) {
            assertEquals("symbol " + (i + 1), linkedList.get(i));
        }
    }

    @Test
    void testRemove_RemoveLast() {
        createStringList(16);
        assertTrue(linkedList.remove("symbol P"));
        assertEquals(15, linkedList.size());
    }

    @Test
    public void testContains_First_Intermediate_Last() {

        createStringList(16);

        assertTrue(linkedList.contains("symbol A"));
        assertTrue(linkedList.contains("symbol C"));
        assertTrue(linkedList.contains("symbol P"));

    }

    @Test
    public void testRemove_RemoveIntermediate() {

        for (int i = 0; i < 16; i++) {
            linkedList.addLast("symbol " + i);
        }

        String removeElement = "symbol 5";
        assertTrue(linkedList.remove(removeElement));
        assertEquals(15, linkedList.size());

        for (int i = 0; i < 5; i++) {
            assertEquals("symbol " + i, linkedList.get(i));
        }

        for (int i = 5; i < linkedList.size(); i++) {
            assertEquals("symbol " + (i + 1), linkedList.get(i));
        }
    }

    @Test
    public void testUniversal_addSeveralElementsThenSetThenRemove_etc() {
        addElementsToList(4);//{0,1,2,3}

        list.removeById(2);//{0,1,3}
        list.set(1, 5);//{0,5,3}

        list.addLast(-10);//{0,5,3,-10}
        list.addLast(-15);//{0,5,3,-10,-15}

        list.removeById(2);//{0,5,-10,-15}
        list.removeById(0);//{5,-10,-15}

        assertEquals(3, list.size());

        assertEquals(5, list.get(0));
        assertEquals(-10, list.get(1));
        assertEquals(-15, list.get(2));
    }

    private void createStringList(int index) {

        String symbol = "symbol ";
        for (char i = 65; i < (65 + index); i++) {
            linkedList.addLast(symbol + i);
        }
    }

    @Test
    public void testClear_emptyList() {
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testClear_nonEmptyList() {
        addElementsToList(20);

        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddLast_addInitialCapacityPlusOneElements_correctSizAndCapacity() {
        for (int i = 0; i < 17; i++) {
            list.addLast(i);
        }
        assertEquals(17, list.size());
    }

    private void addElementsToList(int number) {
        for (int j = 0; j < number; j++) {
            list.addLast(j);
        }
    }

}