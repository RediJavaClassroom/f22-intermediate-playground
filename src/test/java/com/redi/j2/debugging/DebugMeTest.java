package com.redi.j2.debugging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DebugMeTest {

    DebugMe debugMe = new DebugMe();

    @Test
    void testHighAndLow() {
        assertEquals("5 1", debugMe.highAndLow("1 2 3 4 5"));
        assertEquals("-1 -1000", debugMe.highAndLow("-1000 -100 -1"));
        assertEquals("9000 -1", debugMe.highAndLow("234 5444 6 6 9000 -1"));
    }

    @Test
    void testGetSum() {
        assertEquals(1, debugMe.getSum(1, 0));
        assertEquals(3, debugMe.getSum(1, 2));
        assertEquals(1, debugMe.getSum(0, 1));
        assertEquals(1, debugMe.getSum(1, 1));
        assertEquals(-1, debugMe.getSum(-1, 0));
        assertEquals(2, debugMe.getSum(-1, 2));
        assertEquals(14, debugMe.getSum(-1, 5));
        assertEquals(14, debugMe.getSum(5, -1));
    }

    @Test
    void testFindNextSquare() {
        assertEquals(144, debugMe.findNextSquare(121));
        assertEquals(676, debugMe.findNextSquare(625));
        assertEquals(-1, debugMe.findNextSquare(114));
    }
}
