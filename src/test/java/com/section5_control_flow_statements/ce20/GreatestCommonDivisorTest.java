package com.section5_control_flow_statements.ce20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest {

    static GreatestCommonDivisor greatestCommonDivisor;

    @BeforeAll
    public static void init() {
        greatestCommonDivisor = new GreatestCommonDivisor();
    }

    @SuppressWarnings("static-access")
    @Test
    public void getGreatestCommonDivisorWithinRangeTest() {
        int expected = 5;
        int actual = greatestCommonDivisor.getGreatestCommonDivisor(25, 15);
        Assertions.assertEquals(expected, actual);

        expected = 6;
        actual = greatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        Assertions.assertEquals(expected, actual);

        expected = 9;
        actual = greatestCommonDivisor.getGreatestCommonDivisor(81, 153);
        Assertions.assertEquals(expected, actual);

        expected = 10;
        actual = greatestCommonDivisor.getGreatestCommonDivisor(1010, 10);
        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void getGreatestCommonDivisorNotWithinRangeTest() {
        int expected = -1;
        int actual = greatestCommonDivisor.getGreatestCommonDivisor(9, 18);

        Assertions.assertEquals(expected, actual);
    }
}