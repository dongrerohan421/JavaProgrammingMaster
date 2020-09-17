package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce46;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TazTest {
    Taz empty = new Taz();
    static Taz one = new Taz();
    static Taz many = new Taz();

    @BeforeAll
    public static void init() {
        one.add("Carl");
        many.add("Veronica");
        many.add("Kev");
    }

    @Test
    public void isEmptyTest() {
        assertTrue(empty.isEmpty());
    }

    @Test
    public void addTest() {
        assertTrue(empty.isEmpty());
        assertFalse(one.isEmpty());
        assertFalse(many.isEmpty());
    }

    @Test
    public void noOfPersonTest() {
        assertEquals(0, empty.noOfPerson());
        assertEquals(1, one.noOfPerson());
        assertEquals(2, many.noOfPerson());
    }

    @Test
    public void isOnboardTest() {
        assertTrue(one.isOnboard("Carl"));
        assertFalse(one.isOnboard("Kev"));
        assertTrue(many.isOnboard("Kev"));
        assertTrue(many.isOnboard("Veronica"));
        assertFalse(many.isOnboard("Carl"));
    }

    @Test
    public void removePersonTest() {
        assertTrue(one.removePerson("Carl"));
        assertEquals(0, one.noOfPerson());
        assertTrue(many.removePerson("Kev"));
        assertEquals(1, many.noOfPerson());
        assertTrue(many.isOnboard("Veronica"));
    }
}
