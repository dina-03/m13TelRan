package test.de.telran;

import org.junit.Assert;
import org.junit.Test;
import telran.OurArrayList;

import java.util.Iterator;

import static org.junit.Assert.*;

public class OurArrayListTest {
    OurArrayList<Integer> ail = new OurArrayList();

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
    public void testAddLast_Equals() {
        int[] arr = {1, 2, 3};
        for (int a : arr) {
            ail.addLast(a);
        }
        assertEquals((Integer) 3, ail.get(2));
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
        assertEquals((Integer) 7, ail.get(1));
        assertEquals((Integer) 8, ail.get(2));
    }

    @Test
    public void removeById() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int a : arr) {
            ail.addLast(a);
        }
        Object actualDeletedNumber = ail.removeById(4); // 4
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
            assertEquals((Integer) numbers[i], ail.get(i));
        }
    }

    @Test
    public void testAddLast_addInitialCapacityPlusElements_correctSizeAndCapacity() {
        //  int[] numbers = {1, 2, 3, 4, 5, -7, 10, 8, 9, 12, -22, 14, 15, 16, 18, 17, 19};
        for (int i = 0; i < 17; i++) {
            ail.addLast(i);
        }
        assertEquals(17, ail.size());
    }

    @Test
    public void testRemoveById_addSeveralElementsAndRemoveLast_correct() {
        int[] numbers = {1, 2, 3, 4, 5, -7, 10, 20};
        for (int number : numbers) {
            ail.addLast(number);
        }
        assertEquals((Integer) 20, ail.removeById(7));
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
        assertEquals((Integer) 15, ail.removeById(15));
        assertEquals((Integer) 15, (Integer) ail.size());
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
    public void testClear_NotEmptyList() {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
        ail.clear();
        assertEquals(0, ail.size());
    }

    @Test
    public void testRemoveZeroIndexElement_correct() {
        for (int i = 0; i < 16; i++) {
            ail.addLast(i);
        }
        assertEquals((Integer) 0, ail.removeById(0));
    }

    @Test
    public void testRemoveMiddleElement_correct() {
        int[] numbers = {1, 2, 4, 7, 9, 8, 11};
        int middle = numbers.length / 2;
        for (int i = 0; i < numbers.length; i++) {
            ail.addLast(i);
        }
        assertEquals((Integer) 3, ail.removeById(middle));
    }

    @Test
    public void testRemoveByIdElement_addCapacityNumberElementsAndRemoveIntermediate_correct() {
        for (int i = 0; i < 18; i++) {
            ail.addLast(i);
        }
        assertEquals((Integer) 5, ail.removeById(5));
        assertEquals((Integer) 17, (Integer) ail.size());

        for (int i = 0; i < 5; i++) {
            assertEquals((Integer) i, ail.get(i));
        }
        for (int i = 5; i < ail.size(); i++) {
            assertEquals((Integer) (i + 1), (Integer) ail.get(i));
        }
    }

    @Test
    public void testRemoveByIdElement_setToFirstIndex_correct() {
        addElementsToList(5);
        ail.set(0, 100098);
        assertEquals((Integer) 100098, ail.get(0));
    }

    @Test
    public void testRemoveByIdElement_setToLastIndex_correct() {
        addElementsToList(5);
        ail.set(ail.size() - 1, 400);
        assertEquals((Integer) 400, ail.get(ail.size() - 1));
    }

    @Test
    public void testRemoveByIdElement_setToIndexBetweenFirstAndLast_correct() {
        int numberOfElements = 20;
        addElementsToList(numberOfElements);
        ail.set(17, 3030);
        assertEquals((Integer) 3030, ail.get(17));
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
        assertEquals((Integer) 5, ail.get(0));
       /* assertEquals((T)-10, ail.get(1));
        assertEquals((T)-15, ail.get(2));*/
    }

    @Test
    public void testForwardIterator_emptyList_correct() {
        //String[] initialElement = {};
        //String[] expected = {};
        OurArrayList<String> stringOurArrayList = new OurArrayList<>();
        Iterator<String> iterator = stringOurArrayList.forwardIterator();
        assertFalse(iterator.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testForwardIterator_oneElement_correct() {
        // String[] initialElement = {};
        String[] expected = {"Evgeniy"};
        OurArrayList<String> stringOurArrayList = new OurArrayList<>();
        stringOurArrayList.addLast("Evgeniy");
        Iterator<String> iterator = stringOurArrayList.forwardIterator();

        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expected[i++], iterator.next());
        }

        assertEquals(1, i);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testForwardIterator_severalElement_correct() {
        String[] initialElement = {};
        String[] expected = {"Evgeniy", "Vladimir", "Vasiliy", "Sergey"};
        OurArrayList<String> stringOurArrayList = new OurArrayList<>();
        stringOurArrayList.addLast("Evgeniy");
        stringOurArrayList.addLast("Vladimir");
        stringOurArrayList.addLast("Vasiliy");
        stringOurArrayList.addLast("Sergey");
        Iterator<String> iterator = stringOurArrayList.forwardIterator();

        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expected[i++], iterator.next());
        }

        assertEquals(4, i);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testBackwardIterator_emptyElement_correct() {
        OurArrayList<String> stringOurArrayList = new OurArrayList<>();
        Iterator<String> iterator = stringOurArrayList.forwardIterator();
        assertFalse(iterator.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }


    @Test
    public void testBackwardIterator_oneElement_correct() {
        String[] expected = {"Evgeniy"};
        OurArrayList<String> stringOurArrayList = new OurArrayList<>();
        stringOurArrayList.addLast("Evgeniy");
        Iterator<String> iterator = stringOurArrayList.backwardIterator();

        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expected[i++], iterator.next());
        }

        assertEquals(1, i);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testBackwardIterator_severalElement() {
        String[] expected = {"Sergey", "Vasiliy", "Vladimir", "Evgeniy"};
        OurArrayList<String> stringOurArrayList = new OurArrayList<>();
        stringOurArrayList.addLast("Evgeniy");
        stringOurArrayList.addLast("Vladimir");
        stringOurArrayList.addLast("Vasiliy");
        stringOurArrayList.addLast("Sergey");
        Iterator<String> iterator = stringOurArrayList.backwardIterator();

        int i = 0;
        while (iterator.hasNext()) {
            assertEquals(expected[i++], iterator.next());
        }

        assertEquals(4, i);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    private void addElementsToList(int number) {
        for (int i = 0; i < number; i++) {
            ail.addLast(i);
        }
    }
}