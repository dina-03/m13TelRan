package day1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();
    String str = "olleH";

    @Test
    public void reversS() {
        String input = main.reversS("Hello");
        Assert.assertEquals(str, input);
    }

    @Test
    public void reversTow() {
        String input = main.reversTow("Hello");
        Assert.assertEquals(str, input);
    }

    @Test
    public void testRecursionNSquare_nEquals1_1() {
        assertEquals(1, main.recursionNSquare(1)); // 1- мы ожидаем
    }

    @Test
    public void testRecursionNSquare_nEquals10_100() {
        assertEquals(100, main.recursionNSquare(10)); // 100- мы ожидаем
    }

    @Test
    public void testRecursionNSquare_nEquals13_169() {
        assertEquals(169, main.recursionNSquare(13)); // 169- мы ожидаем
    }

    @Test
    public void recursionNSquare() {
        int a = 25;
        int b = main.recursionNSquare(5);
        Assert.assertEquals(b, a);
    }

    @Test
    public void recursionNodTest() {
        int nod = 6;
        int sum = main.recursionNod(30, 18);
        Assert.assertEquals(nod, sum);
    }
}