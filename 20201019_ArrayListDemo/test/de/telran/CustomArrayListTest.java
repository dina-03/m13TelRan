package de.telran;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomArrayListTest {
    //List<String> list2 = new ArrayList<>();

    @Test
    public void testSizeZero() {
        CustomArrayList al = new CustomArrayList();
        assertEquals(0, al.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] arr = {1, 2, 3, 4};
        CustomArrayList<Integer> num = new CustomArrayList<>();
        for (int a : arr) {
            num.add(a);
        }
        assertEquals(4, num.size());
    }

    @Test
    public void testCorrectSizeChanged() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        CustomArrayList<Integer> num = new CustomArrayList<>();
        for (int a : arr) {
            num.add(a);
        }
        assertEquals(7, num.size());
    }

    @Test
    public void testAddCorrectOrder() {
        int[] arr = {1, 3, 2, 4};
        CustomArrayList<Integer> num = new CustomArrayList<>();
        for (int a : arr) {
            num.add(a);
        }
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], num.get(i).intValue());
        }
    }

    @Test
    public void testRemoveByIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        CustomArrayList<Integer> num = new CustomArrayList<>();
        for (int a : arr) {
            num.add(a);
        }
        int actualDeleteNumber = num.removeById(2); //3
        int[] expected = {1, 2, 4, 5};
        Assert.assertEquals(3, actualDeleteNumber);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], (int) num.get(i)); // num.get(i).intValue());
        }
        Assert.assertEquals(4, num.size());
    }
    //write test with String
    @Test
    public void testRemoveByIndexStringArray(){
        String[] input = {"aa", "bb", "cc", "dd","ee"};
        CustomArrayList<String> listString = new CustomArrayList<String>();
        for (String s : input) {
            listString.add(s);
        }
        String actualDeleteString = listString.removeById(1) ;
        String[] expected = {"aa", "cc", "dd", "ee"};
        Assert.assertEquals("bb",actualDeleteString);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], listString.get(i));
        }
        Assert.assertEquals(4, listString.size());
    }

    @Test
    public void testRemoveByElement() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> listString = new CustomArrayList<>();
        for (String s : input) {
            listString.add(s);
        }
        boolean isRemoved = listString.remove("aa");
        boolean isNotRemoved = listString.remove("ff");
        Assert.assertTrue(isRemoved);
        Assert.assertFalse(isNotRemoved);
        String[] expected = {"bb","cc","dd"};
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], listString.get(i));
        }
        Assert.assertEquals(3,listString.size());
    }

    @Test
    public void testIndexOf(){
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomArrayList<String> listString = new CustomArrayList<String>();
        for (String s : input) {
            listString.add(s);
        }
        Assert.assertEquals(2,listString.indexOf("cc"));
    }
}
