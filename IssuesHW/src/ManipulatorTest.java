import org.junit.*;

import static org.junit.Assert.*;

public class ManipulatorTest {
    Manipulator manipulator = new Manipulator();

    @Test
    public void testCheckPalindrome1() {
        manipulator = new Manipulator();
        boolean s = manipulator.checkPalindrome1("НАГАН");
        Assert.assertTrue(s);
    }

    @Test
    public void testCheckPalindrome1Two() {
        manipulator = new Manipulator();
        boolean s = manipulator.checkPalindrome1("ЦВЕТОК");
        Assert.assertFalse(s);
    }

    @Test
    public void testNonStart() {
        // manipulator = new Manipulator();
        String s = manipulator.nonStart("Hello", "There");
        Assert.assertEquals("ellohere", s);
    }

    @Test
    public void testMiddleTwo() {
        String str = manipulator.middleTwo("string");
        Assert.assertEquals("ri", str);
    }

    @Test
    public void testZeroMax() {
        int[] e1 = {0, 5, 0, 3};
        int[] e2 = {5, 5, 3, 3};
        assertArrayEquals(manipulator.zeroMax(e1), e2);
    }

    @Test
    public void testCommonEnd() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {7, 3};
        int[] c1 = {1, 2, 3};
        int[] c2 = {7, 3, 2};
        assertTrue("CommonEnd", manipulator.commonEnd(a1, a2));
        assertFalse(manipulator.commonEnd(c1, c2));
    }

    @Test
    public void testGetMaxArray() {
        int[] array = {8, 3, 7, 5, 6, 10, 12, 25, 2};
        Assert.assertEquals(25, Manipulator.getMaxArray(array));
    }

    @Test
    public void testGetMinArray() {
        int[] array = {8, 3, 7, 5, 6, 10, 12, 25, 2};
        Assert.assertEquals(2, Manipulator.getMinArray(array));
    }

    @Test
    public void testFillArray() {
        int[] arr = {5, 7, 9, 11, 13};
        Assert.assertArrayEquals(arr, Manipulator.fillArray(5, 2, arr));
    }

    @Test
    public void testCheckPalindrome2() {
        boolean b = manipulator.checkPalindrome2("А РОЗА УПАЛА НА ЛАПУ АЗОРА");
        Assert.assertTrue(b);
    }

    @Test
    public void testCheckPalindrome2Two() {
        boolean b = manipulator.checkPalindrome2("ДОБРЫЙ ДЕНЬ");
        Assert.assertFalse(b);
    }

    @Test
    public void testShiftLeft1() {
        int[] a1 = {6, 2, 5, 3};
        int[] a2 = {2, 5, 3, 6};
        Assert.assertArrayEquals(a2, manipulator.shiftLeft(a1));
    }

    @Test
    public void testShiftLeft2() {
        int[] b1 = {1, 2};
        int[] b2 = {2, 1};
        Assert.assertArrayEquals(b2, manipulator.shiftLeft(b1));
    }

    @Test
    public void testShiftLeft3() {
        int[] a1 = {1};
        Assert.assertArrayEquals(new int[]{1}, manipulator.shiftLeft(a1));
    }

    @Test
    public void testArrayFilling() {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        Assert.assertArrayEquals(arr,manipulator.arrayFilling());
    }
}
