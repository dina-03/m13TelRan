package de.telran;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] numbers = {1, 3, 1};
        assertEquals(3, solution.solve(numbers));
    }

    @Test
    public void test2() {
        int[] numbers = {1, 3, 1, 1, 3};
        assertEquals(1, solution.solve(numbers));
    }

    @Test
    public void test3() {
        int[] numbers = {1, 3, 1, 1, 5, -10, 7, -15, -15, -10, 1, 7, 3};
        assertEquals(5, solution.solve(numbers));
    }
}