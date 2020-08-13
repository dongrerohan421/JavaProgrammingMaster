package com.section6_classes_constructors_inheritance.ce30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonTest {

    static Person person;

    @BeforeAll
    public static void init() {
        person = new Person();
    }

    @Test
    public void isTeenTest() {
        person.setAge(13);
        boolean expected = true;
        boolean actual = person.isTeen();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isNotTeenTest() {
        person.setAge(10);
        boolean expected = true;
        boolean actual = person.isTeen();

        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    public void getFullNameTest() {
        person.setFirstName("John");
        person.setLastName("Smith");

        String expected = "John Smith";
        String actual = person.getFullName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnFirstNameLastNameEmptyTest() {
        person.setFirstName("John");
        person.setLastName("");

        String expected = "John";
        String actual = person.getFullName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnLastNameFirstNameEmptyTest() {
        person.setFirstName("");
        person.setLastName("Smith");

        String expected = "Smith";
        String actual = person.getFullName();

        Assertions.assertEquals(expected, actual);
    }

}