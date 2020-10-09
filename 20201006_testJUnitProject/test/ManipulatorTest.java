import org.junit.*;

import static org.junit.Assert.*;

public class ManipulatorTest {
    Manipulator manipulator = new Manipulator();

    @Ignore
    @Before
    public void init() {
        System.out.println("test start");
    }
    @After
    public void end(){
        System.out.println("test over");
    }
    //@Ignore
    @Test
    public void testCompareNumbers_FalseCase() {
        boolean b = manipulator.compareNumbers(3, 5);
        Assert.assertFalse(b);
    }

    @Test
    public void testCompareNumberTrue() {
        // Manipulator manipulator = new Manipulator();
        assertTrue("CompareNumberTrueCase", manipulator.compareNumbers(6, 3));
    }

    //aa, bb -> aabb;
    //notNull
    //str1.length() + str2.length() = res.length()
    @Test
    public void testConcatValue() {
        //  Manipulator manipulator = new Manipulator();
        String s = manipulator.concat("aa", "bb");
        Assert.assertEquals("test", "aabb", s);
    }

    @Test
    public void testConcatLengthResult() {
        // Manipulator manipulator = new Manipulator();
        String s = manipulator.concat("aa", "bb");
        Assert.assertEquals(4, s.length());
    }
   // @Ignore
    @Test
    public void testConcatNotNull() {
        // Manipulator manipulator = new Manipulator();
        String s = manipulator.concat("aa", "bb");
        Assert.assertNotNull(s);
    }

}
