package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce42;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MinElementChallengeTest {

    static MinElementChallenge minElementChallenge;

    @BeforeAll
    public static void init() {
        minElementChallenge = new MinElementChallenge();
    }

    @SuppressWarnings("static-access")
    @Test
    public void testFindMin() {

        int[] myArray = { 54, 2, 34, 8, 4 };
        int actual = minElementChallenge.findMin(myArray);
        int expected = 2;

        assertEquals(actual, expected);
    }
}
