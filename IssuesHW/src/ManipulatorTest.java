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
    @Ignore
    @Test
    public void testGetMaxArray(){
        int[] array = {8, 3, 7, 5, 6, 10, 12, 25, 2};
        //assertTrue(manipulator.getMaxArray());
    }
}
