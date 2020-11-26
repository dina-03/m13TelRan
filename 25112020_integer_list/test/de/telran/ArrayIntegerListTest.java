package de.telran;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayIntegerListTest {
    ArrayIntegerList ail = new ArrayIntegerList();
    {
        ail.addLast(1);
        ail.addLast(2);
        ail.addLast(3);
    }

    @Test
    public void testAddLast() {
        Assert.assertEquals(3, ail.size());
    }

    @Test
    public void increaseCapacity() {
    }

    @Test
    public void get() {
    }

    @Test
    public void set() {
    }

    @Test
    public void removeById() {
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