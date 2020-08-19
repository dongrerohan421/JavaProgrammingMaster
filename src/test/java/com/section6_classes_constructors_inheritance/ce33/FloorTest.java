package com.section6_classes_constructors_inheritance.ce33;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FloorTest {
    static Floor floor;

    @BeforeAll
    public static void init() {
        floor = new Floor();
    }

    @Test
    public void testFloorConstructor() {
        double width = 5.9;
        double length = 6.9;
        floor = new Floor(width, length);
        assertEquals(floor.getWidth(), width);
        assertEquals(floor.getLength(), length);
    }

    @Test
    public void testFloorConstructorReturnZeroWidth() {
        double width = -1.0;
        double length = 6.9;
        double expected = 0;
        floor = new Floor(width, length);
        assertEquals(floor.getWidth(), expected);
    }

    @Test
    public void testFloorConstructorReturnZeroLength() {
        double width = 3.0;
        double length = -6.9;
        double expected = 0;
        floor = new Floor(width, length);
        assertEquals(floor.getLength(), expected);
    }

    @Test
    public void testFloorConstructorReturnZeroWidthAndLength() {
        double width = -3.0;
        double length = -6.9;
        double expected = 0;
        floor = new Floor(width, length);
        assertEquals(floor.getLength(), expected);
        assertEquals(floor.getWidth(), expected);
        assertNotEquals(floor.getWidth(), width);
    }

    @Test
    public void testGetArea() {
        double width = 5.0;
        double length = 6.0;
        double expected = 30.0;
        floor = new Floor(width, length);
        double actual = floor.getArea();
        assertEquals(expected, actual);
    }

}