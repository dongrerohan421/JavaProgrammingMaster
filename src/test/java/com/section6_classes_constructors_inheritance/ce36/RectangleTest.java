package com.section6_classes_constructors_inheritance.ce36;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    static Rectangle rectangle;
    static Rectangle rectangleReturnZero;
    static double width;
    static double length;
    static double negativeWidth;
    static double negativeLength;

    @BeforeAll
    public static void init() {
        width = 5;
        length = 10;
        rectangle = new Rectangle(width, length);

        negativeWidth = -5.9;
        negativeLength = -6.9;
        rectangleReturnZero = new Rectangle(negativeWidth, negativeLength);
    }

    @Test
    public void testGetWidth() {
        assertEquals(rectangle.getWidth(), width);
    }

    @Test
    public void testGetLength() {
        assertEquals(rectangle.getLength(), length);
    }

    @Test
    public void testGetWidthReturnZero() {
        double expected = 0;
        assertEquals(rectangleReturnZero.getWidth(), expected);
    }

    @Test
    public void testGetLengthReturnZero() {
        double expected = 0;
        assertEquals(rectangleReturnZero.getLength(), expected);
    }

    @Test
    public void testGetArea() {
        double expected = 50.0;
        assertEquals(rectangle.getArea(), expected);
    }

    @Test
    public void testGetAreaReturnZero() {
        double expected = 0.0;
        assertEquals(rectangleReturnZero.getArea(), expected);
    }
}