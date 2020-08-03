package com.section5_control_flow_statements.ce19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LastDigitCheckerTest {

    static LastDigitChecker lastDigitChecker;

    @BeforeAll
    public static void init() {
        lastDigitChecker = new LastDigitChecker();
    }

    @SuppressWarnings("static-access")
    @Test
    public void hasSameLastDigitWithinRangeTest() {
        boolean expected = true;
        boolean actual = lastDigitChecker.hasSameLastDigit(23, 32, 42);

        Assertions.assertEquals(expected, actual);

        expected = true;
        actual = lastDigitChecker.hasSameLastDigit(41, 22, 71);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void hasSameLastDigitNotWithinRangeTest() {
        boolean expected = true;
        boolean actual = lastDigitChecker.hasSameLastDigit(9, 99, 999);

        Assertions.assertNotEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void isValidWithinRangeTest() {
        boolean expected = true;
        boolean actual = lastDigitChecker.isValid(10);

        Assertions.assertEquals(expected, actual);

        expected = true;
        actual = lastDigitChecker.isValid(468);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    public void isValidNotWithinRangeTest() {
        boolean expected = true;
        boolean actual = lastDigitChecker.isValid(9);

        Assertions.assertEquals(expected, actual);

        expected = true;
        actual = lastDigitChecker.isValid(1051);

        Assertions.assertEquals(expected, actual);
    }
}