package de.telran;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CustomLinkedListTest {
    private CustomList<Integer> list = new CustomLinkedList<>();
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

    }

    @Test
    public void testRemoveById() {

    }

    @Test
    public void testRemove(){

    }
}