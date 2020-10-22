package de.telran;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CustomLinkedListTest {
    private CustomList<Integer> list = new CustomLinkedList<Integer>();
    private CustomList<String> listString = new CustomLinkedList<>();

    @Test
    public void testSizeZero() {
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSizeNotZero() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Assert.assertEquals(10, list.size());
    }

    @Test
    public void testAddElementValue() {
        listString.add("test");
        // CustomLinkedList.Node node = ((CustomLinkedList<String>) listString).getFirst();
        String str = listString.get(0);
        Assert.assertEquals("test", str);
    }

    @Test
    public void testGetElementValue() {
        listString.add("aa");
        listString.add("bb");
        Assert.assertEquals("aa", listString.get(0));
        Assert.assertEquals("bb", listString.get(1));
    }

    @Test
    public void testGetElementValueInt() {
        list.add(1);
        list.add(2);
        int a = list.get(0);
        int b = list.get(1);
        Assert.assertEquals(1, a);
        Assert.assertEquals(2, b);
    }

    @Test
    public void testRemoveById() {
        String[] arr = {"a", "b", "c"};
        for (String s : arr) {
            listString.add(s);
        }
        String actualDeleteStringById = listString.removeById(1);
        String[] expected = {"a", "c"};
        Assert.assertEquals("b", actualDeleteStringById);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], listString.get(i));
        }
        Assert.assertEquals(2, listString.size());
    }

    @Test
    public void testRemoveByIdTwo() {
        int[] arr = {1, 2, 3, 4};
        for (int a : arr) {
            list.add(a);
        }
        int actualDeleteStringById = list.removeById(2);
        Assert.assertEquals(3,actualDeleteStringById);
    }

    @Test
    public void testRemove() {
        String[] arr = {"one", "two"};
        for (String s : arr) {
            listString.add(s);
        }
        boolean isRemoved = listString.remove("one");
        boolean isNotRemoved = listString.remove("tree");
        Assert.assertTrue(isRemoved);
        Assert.assertFalse(isNotRemoved);
        String[] expected = {"two"};
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], listString.get(i));
        }
        Assert.assertEquals(1, listString.size());
    }
}