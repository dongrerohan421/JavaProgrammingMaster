package com.section6_classes_constructors_inheritance.ce36;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CuboidTest {
    static Cuboid cuboid;
    static Cuboid cuboidReturnZero;
    static double height;
    static double neagativeNeight;
    static double expected;

    @BeforeAll
    public static void init() {
        cuboid = new Cuboid(5, 10, 5);
        cuboidReturnZero = new Cuboid(-5, 10, -4);
    }

    @Test
    public void testGetHeight() {
        expected = 5.0;
        assertEquals(expected, cuboid.getHeight());
    }

    @Test
    public void testGetHeightRetrunZero() {
        expected = 0.0;
        assertEquals(expected, cuboidReturnZero.getHeight());
    }

    @Test
    public void testGetVolume() {
        expected = 250.0;
        assertEquals(expected, cuboid.getVolume());
    }

    @Test
    public void testGetVolumeReturnZero() {
        expected = 0.0;
        assertEquals(expected, cuboidReturnZero.getVolume());
    }
}