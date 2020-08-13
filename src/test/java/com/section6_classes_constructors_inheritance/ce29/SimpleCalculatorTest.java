package com.section6_classes_constructors_inheritance.ce29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    static SimpleCalculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
    }

    @Test
    public void getAdditionResultTest() {
        double expected = 9.0;
        double actual = calculator.getAdditionResult();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getSubtractionResultTest() {
        double expected = 1.0;
        double actual = calculator.getSubtractionResult();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getMultiplicationResultTest() {
        double expected = 20.0;
        double actual = calculator.getMultiplicationResult();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getDivisionResultTest() {
        double expected = 1.25;
        double actual = calculator.getDivisionResult();

        Assertions.assertEquals(expected, actual);

    }

}