package com.section6_classes_constructors_inheritance.ce33;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarpetTest {
    static Carpet carpet;

    @BeforeAll
    public static void init() {
        carpet = new Carpet();
    }

    @Test
    public void testCarpetConstructor() {
        double cost = 3.0;
        carpet = new Carpet(cost);
        assertEquals(carpet.getCost(), cost);
    }

    @Test
    public void testCarpetConstructorReturnZeroCost() {
        double expected = 0;
        carpet = new Carpet(-3.0);
        assertEquals(carpet.getCost(), expected);
    }

}