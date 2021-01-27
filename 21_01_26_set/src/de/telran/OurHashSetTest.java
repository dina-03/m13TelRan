package de.telran;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest<T> {
    OurHashSet<T> hashSet = new OurHashSet<>();
    OurHashSet<Integer> hashIntSet = new OurHashSet<>();

    @Test
    public void addingElement_shouldAddElement(){
        assertTrue(hashSet.add((T) "String Element"));
    }

    @Test
    public void addingElementInt_shouldAddElement(){
        assertTrue(hashIntSet.add(2));
        assertTrue(hashIntSet.add(5));
    }

    @Test
    public void checkingForElement_shouldSearchElement(){
        hashSet.add((T) "String Element");
        assertTrue(hashSet.contains((T) "String Element"));
    }

    @Test
    public void checkingForIntElement_shouldSearchElement(){
        hashIntSet.add(3);
        hashIntSet.add(5);
        hashIntSet.add(-5);
        assertTrue(hashIntSet.contains(3));
        assertTrue(hashIntSet.contains(5));
        assertFalse(hashIntSet.contains(9));
    }

    @Test
    public void removingElement_shouldRemoveElement(){
        hashSet.add((T) "String Element");
        assertTrue(hashSet.remove((T) "String Element"));
    }

    @Test
    public void removingElementInt_shouldRemoveElement(){
        hashIntSet.add(1);
        hashIntSet.add(4);
        hashIntSet.add(8);
        hashIntSet.add(18);
        hashIntSet.add(-28);
        assertTrue(hashIntSet.remove(4));
        assertFalse(hashIntSet.remove(5));
    }

    @Test
    public void checkingTheSizeOfHashSet_shouldTheSize(){
        hashSet.add((T) "one element");
        hashSet.add((T) "second element");
        hashSet.add((T) "33");
        assertEquals(3,hashSet.size());
    }

    @Test
    public void checkingTheSizeOfHashIntSet_shouldTheSize(){
        hashIntSet.add(1);
        hashIntSet.add(4);
        hashIntSet.add(8);
        hashIntSet.add(18);
        hashIntSet.add(-28);
        assertEquals(5,hashIntSet.size());
    }
}