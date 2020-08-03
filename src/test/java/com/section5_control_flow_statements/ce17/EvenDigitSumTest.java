package com.section5_control_flow_statements.ce17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EvenDigitSumTest {
    static EvenDigitSum evenDigitSum;

    @BeforeAll
    public static void setup() {
        evenDigitSum = new EvenDigitSum();
    }

    @SuppressWarnings("static-access")
    @Test
    void getEvenDigitSumTest() {
        int expected = 20;
        int actual = evenDigitSum.getEvenDigitSum(123456789);

        Assertions.assertEquals(expected, actual);

        expected = 4;
        actual = evenDigitSum.getEvenDigitSum(252);

        Assertions.assertEquals(expected, actual);
    }

    @SuppressWarnings("static-access")
    @Test
    void getEvenDigitSumWhenNumberIsNegativeTest() {
        int expected = -1;
        int actual = evenDigitSum.getEvenDigitSum(-22);

        Assertions.assertEquals(expected, actual);
    }
}