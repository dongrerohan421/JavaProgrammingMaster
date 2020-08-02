package com.section5_control_flow_statements.ce16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstLastDigitSumTest {

    static FirstLastDigitSum firstLastDigitSum;

    @BeforeAll
    public static void setup() {
        firstLastDigitSum = new FirstLastDigitSum();
    }

    @SuppressWarnings("static-access")
    @Test
    void sumFirstAndLastDigitTest() {
        int expected = 4;
        int actual = firstLastDigitSum.sumFirstAndLastDigit(252);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    void findTotalDigitsTestReturnNegative() {
        int expected = -1;
        int actual = firstLastDigitSum.sumFirstAndLastDigit(-10);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    void findTotalDigitsTestReturnZero() {
        int expected = 0;
        int actual = firstLastDigitSum.sumFirstAndLastDigit(0);

        Assertions.assertEquals(expected, actual);
    }
}