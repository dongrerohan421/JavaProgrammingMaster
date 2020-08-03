package com.section5_control_flow_statements.ce18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SharedDigitTest {
    static SharedDigit sharedDigit;

    @BeforeAll
    public static void init() {
        sharedDigit = new SharedDigit();
    }

    @SuppressWarnings("static-access")
    @Test
    void hasSharedDigitWithinRangeTest() {
        boolean expected = true;
        boolean actual = sharedDigit.hasSharedDigit(12, 23);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    void hasSharedDigitNotWithinRangeTest() {
        boolean expected = false;
        boolean actual = sharedDigit.hasSharedDigit(9, 99);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    void hasNotSharedDigitWithinRangeTest() {
        boolean expected = false;
        boolean actual = sharedDigit.hasSharedDigit(13, 44);

        Assertions.assertEquals(expected, actual);
    }
}