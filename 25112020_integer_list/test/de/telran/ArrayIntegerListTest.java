package de.telran;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayIntegerListTest {
    ArrayIntegerList ail = new ArrayIntegerList();

    @Test
    public void testAddLast() {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ail.get(40);
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
        int actualDeletedNumber = ail.removeById(3); // 4
        int[] expected = {1, 2, 3, 5};
        assertEquals(4, actualDeletedNumber);
    }

    @Test
    public void testSizeZero() {
        ArrayIntegerList ail = new ArrayIntegerList();
        Assert.assertEquals(0, ail.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] arr = {1, 2, 3};
        ArrayIntegerList nums = new ArrayIntegerList();
        for (int a : arr) {
            nums.addLast(a);
        }
        Assert.assertEquals(3, nums.size());
    }
}