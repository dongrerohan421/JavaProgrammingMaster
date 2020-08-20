package com.section6_classes_constructors_inheritance.ce34;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ComplexNumberTest {
    static ComplexNumber complexNumber;

    @BeforeAll
    public static void init() {
        complexNumber = new ComplexNumber();
    }

    @Test
    public void testGetReal() {
        double expected = 3.9;
        complexNumber = new ComplexNumber(3.9, 1.0);
        assertEquals(expected, complexNumber.getReal());
    }

    @Test
    public void testGetImaginary() {
        double expected = 2.9;
        complexNumber = new ComplexNumber(3.9, 2.9);
        assertEquals(expected, complexNumber.getImaginary());
    }
}