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

    @Test
    void sumFirstAndLastDigitTest() {
        int expected = 4;
        int actual = firstLastDigitSum.sumFirstLastDigitSum(252);

        Assertions.assertEquals(expected, actual);
    }
}