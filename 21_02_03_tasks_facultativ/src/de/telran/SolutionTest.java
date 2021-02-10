package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSolve_emptyString() {
        assertEquals("", solution.solve(""));
    }

    @Test
    public void testRevers_emptyString() {
        assertEquals("", solution.reversString(""));
    }

    @Test
    public void testSolve_nonEmptyStringWithOddLength() {
        assertEquals("olleH", solution.solve("Hello"));
    }

    @Test
    public void testRevers_nonEmptyStringWithOddLength() {
        assertEquals("olleH", solution.reversString("Hello"));
    }

    @Test
    public void testSolve_nonEmptyStringWithEvenLength() {
        assertEquals("ol!leH", solution.solve("Hel!lo"));
    }

    @Test
    public void testRevers_nonEmptyStringWithEvenLength() {
        assertEquals("ol!leH", solution.reversString("Hel!lo"));
    }

    @Test
    public void testSolve_oneLetter() {
        assertEquals("ol", solution.solve("lo"));
    }

    @Test
    public void testRevers_oneLetter() {
        assertEquals("ol", solution.reversString("lo"));
    }
}