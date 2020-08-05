package com.section5_control_flow_statements.ce22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PerfectNumberTest {
    static PerfectNumber perfectNumber;

    @BeforeAll
    public static void init() {
        perfectNumber = new PerfectNumber();
    }

    @SuppressWarnings("static-access")
    @Test
    public void isPerfectNumberNotWithinRangeTest() {
        boolean expected = true;
        boolean actual = perfectNumber.isPerfectNumber(-1);

        Assertions.assertNotEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void isPerfectNumberWithinRangeTest() {
        boolean expected = true;
        boolean actual = perfectNumber.isPerfectNumber(6);

        Assertions.assertEquals(expected, actual);

        expected = true;
        actual = perfectNumber.isPerfectNumber(28);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void isNotPerfectNumberWithinRangeTest() {
        boolean expected = false;
        boolean actual = perfectNumber.isPerfectNumber(5);

        Assertions.assertEquals(expected, actual);
    }
}