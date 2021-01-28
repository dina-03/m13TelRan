package de.telran;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {
    OurHashSet<String> hashSet = new OurHashSet<>();
    OurHashSet<Integer> hashIntSet = new OurHashSet<>();
    OurHashSet<Integer> set2 = new OurHashSet<>();

    @Test
    public void addingElement_shouldAddElement() {
        assertTrue(hashSet.add("String Element"));
    }

    @Test
    public void addingElementInt_shouldAddElement() {
        assertTrue(hashIntSet.add(2));
        assertTrue(hashIntSet.add(5));
    }

    @Test
    public void checkingForElement_shouldSearchElement() {
        hashSet.add("String Element");
        assertTrue(hashSet.contains("String Element"));
    }

    @Test
    public void checkingForIntElement_shouldSearchElement() {
        hashIntSet.add(3);
        hashIntSet.add(5);
        hashIntSet.add(-5);
        assertTrue(hashIntSet.contains(3));
        assertTrue(hashIntSet.contains(5));
        assertFalse(hashIntSet.contains(9));
    }

    @Test
    public void removingElement_shouldRemoveElement() {
        hashSet.add("String Element");
        assertTrue(hashSet.remove("String Element"));
    }

    @Test
    public void removingElementInt_shouldRemoveElement() {
        hashIntSet.add(1);
        hashIntSet.add(4);
        hashIntSet.add(8);
        hashIntSet.add(18);
        hashIntSet.add(-28);
        assertTrue(hashIntSet.remove(4));
        assertFalse(hashIntSet.remove(5));
    }

    @Test
    public void checkingTheSizeOfHashSet_shouldTheSize() {
        hashSet.add("one element");
        hashSet.add("second element");
        hashSet.add("33");
        assertEquals(3, hashSet.size());
    }

    @Test
    public void checkingTheSizeOfHashIntSet_shouldTheSize() {
        hashIntSet.add(1);
        hashIntSet.add(4);
        hashIntSet.add(8);
        hashIntSet.add(18);
        hashIntSet.add(-28);
        assertEquals(5, hashIntSet.size());
    }

    //test from Anna-Freimuth
    @Test
    void add() {

        hashIntSet.add(1);
        hashIntSet.add(2);
        hashIntSet.add(1);

        assertEquals(2, hashIntSet.size());
        for (int value : hashIntSet) {

            assertTrue(value == 1 || value == 2);
        }
    }

    @Test
    void remove() {
        hashIntSet.add(1);
        hashIntSet.add(2);
        hashIntSet.add(3);
        hashIntSet.add(4);

        assertFalse(hashIntSet.remove(9001));
        assertEquals(4, hashIntSet.size());
        for (int value : hashIntSet) {

            assertTrue(hashIntSet.remove(value));
        }
        assertFalse(hashIntSet.remove(-5));
        assertEquals(2, hashIntSet.size());
    }

    @Test
    void contains() {
        hashIntSet.add(1);
        hashIntSet.add(2);
        hashIntSet.add(3);
        hashIntSet.add(4);

        assertTrue(hashIntSet.contains(1));
        assertFalse(hashIntSet.contains(5));
    }

    @Test
    void size() {
        assertEquals(0, hashIntSet.size());
        hashIntSet.add(1);
        hashIntSet.add(2);
        assertEquals(2, hashIntSet.size());
        hashIntSet.remove(2);

        assertEquals(1, hashIntSet.size());
    }

    @Test
    void addAll() {
        hashIntSet.add(1);
        hashIntSet.add(3);
        hashIntSet.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);


        hashIntSet.addAll(set2);
        assertEquals(5, hashIntSet.size());
        assertTrue(hashIntSet.contains(1));
        assertTrue(hashIntSet.contains(3));
        assertTrue(hashIntSet.contains(5));
        assertTrue(hashIntSet.contains(2));
        assertTrue(hashIntSet.contains(4));
    }

    @Test
    void retainAll() {
        hashIntSet.add(1);
        hashIntSet.add(3);
        hashIntSet.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        hashIntSet.retainAll(set2);
        assertTrue(hashIntSet.contains(3));
        assertEquals(1, hashIntSet.size());
    }

    @Test
    void removeAll() {
        hashIntSet.add(1);
        hashIntSet.add(3);
        hashIntSet.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        hashIntSet.removeAll(set2);
        assertTrue(hashIntSet.contains(1));
        assertTrue(hashIntSet.contains(5));
        assertEquals(2, hashIntSet.size());
    }

    @Test
    void iterator() {

        hashIntSet.add(1);
        hashIntSet.add(2);
        hashIntSet.add(3);

        for (int value : hashIntSet) {
            set2.add(value);
        }

        assertEquals(3, set2.size());
        assertTrue(set2.contains(1));
        assertTrue(set2.contains(2));
        assertTrue(set2.contains(3));
    }

    //test from Maria
    OurSet<Integer> set = new OurHashSet<>();

    @Test
    public void test_add_trueCase_iterator() {
        assertTrue(set.add(5));
        assertEquals(5, set.iterator().next());
    }

    @Test
    public void test_add_falseCase_size() {
        set.add(5);
        assertFalse(set.add(5));
        assertEquals(1, set.size());
    }

    @Test
    public void test_add_severalElements_size() {
        set.add(5);
        set.add(-5);
        set.add(121);
        assertFalse(set.add(5));
        assertFalse(set.add(-5));
        assertFalse(set.add(121));
        assertTrue(set.add(34));
        assertTrue(set.add(0));
        assertEquals(5, set.size());
    }

    @Test
    public void test_remove_falseCase_size() {
        assertFalse(set.remove(2));
        assertEquals(0, set.size());
    }

    @Test
    public void test_remove_trueCase_iterator() {
        set.add(2);
        assertTrue(set.remove(2));
        assertFalse(set.iterator().hasNext());
    }


    @Test
    public void test_add_and_remove_severalElements_size() {
        set.add(5);
        set.add(-5);
        set.add(121);
        assertTrue(set.remove(5));
        assertTrue(set.remove(-5));
        assertFalse(set.remove(-5));
        assertFalse(set.remove(34));
        assertFalse(set.remove(0));
        assertEquals(1, set.size());
    }

    @Test
    public void test_size() {
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        assertEquals(20, set.size());
    }

    @Test
    public void test_contains_trueCase() {
        int[] exp = {5, -5, 0};
        for (int i = 0; i < exp.length; i++) {
            set.add(exp[i]);
            assertTrue(set.contains(exp[i]));
        }
    }

    @Test
    public void test_contains_falseCase() {
        int[] exp = {5, -5, 0};
        for (int i = 0; i < exp.length; i++) {
            assertFalse(set.contains(exp[i]));
        }
    }

    @Test
    public void test_addAll_size_contains() {
        OurHashSet<Integer> another = new OurHashSet<>();
        another.add(2);
        another.add(-5);
        set.add(101);
        set.add(-86);
        set.addAll(another);
        assertEquals(4, set.size());
        assertTrue(set.contains(2));
        assertTrue(set.contains(-5));
        assertTrue(set.contains(101));
        assertTrue(set.contains(-86));
    }

    @Test
    public void test_retainAll_size_contains() {
        OurHashSet<Integer> another = new OurHashSet<>();
        another.add(2);
        another.add(7);
        set.add(7);
        set.add(2);
        set.add(-5);
        set.retainAll(another);
        assertEquals(2, set.size());
        assertTrue(set.contains(2));
        assertTrue(set.contains(7));
        assertFalse(set.contains(101));
        assertFalse(set.contains(-86));
    }

    @Test
    public void test_removeAll_size_contains() {
        OurHashSet<Integer> another = new OurHashSet<>();
        another.add(2);
        another.add(-5);
        another.add(7);
        set.add(101);
        set.add(-86);
        set.add(7);
        set.add(2);
        set.removeAll(another);
        assertEquals(2, set.size());
        assertFalse(set.contains(2));
        assertFalse(set.contains(7));
        assertTrue(set.contains(101));
        assertTrue(set.contains(-86));
    }

    @Test
    public void test_keyIterator() {
        for (int i = 0; i < 5; i++) {
            set.add(i);
            set.add(i * 2);
        }

        Iterator iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            i++;
        }
        assertEquals(7, i);
    }
}