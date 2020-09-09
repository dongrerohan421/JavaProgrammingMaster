package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce43;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ReverseArrayChallengeTest {

    static ReverseArrayChallenge reverseArrayChallenge;

    @BeforeAll
    public static void init() {
        reverseArrayChallenge = new ReverseArrayChallenge();
    }

    @SuppressWarnings("static-access")
    @Test
    public void testReverse() {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] actual = reverseArrayChallenge.reverse(array);
        int[] expected = { 5, 4, 3, 2, 1 };

        assertArrayEquals(expected, actual);
    }
}
