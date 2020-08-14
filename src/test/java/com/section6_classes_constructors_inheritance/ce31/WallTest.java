package com.section6_classes_constructors_inheritance.ce31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WallTest {
    static Wall wall;
    static double width;
    static double height;

    @BeforeAll
    public static void init() {
        wall = new Wall(5, 4);
    }

    @Test
    public void getAreaTest() {
        double expected = 20.0;
        double actual = wall.getArea();
        Assertions.assertEquals(expected, actual);
    }
}