package com.section6_classes_constructors_inheritance.ce33;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void testGetTotalCost() {
        double expected = 36.45;
        calculator = new Calculator(new Floor(5.4, 4.5), new Carpet(1.5));
        double actual = calculator.getTotalCost();
        assertEquals(expected, actual);
    }
}