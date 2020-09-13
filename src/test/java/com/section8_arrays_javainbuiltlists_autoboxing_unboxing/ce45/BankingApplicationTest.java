package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce45;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BankingApplicationTest {

    private static Bank bank;

    @BeforeAll
    public static void init() {
        bank = new Bank("Chase");
        bank.addBranch("Charlotte");

    }

    @Test
    public void testAddCustomer() {
        assertTrue(bank.addCustomer("Charlotte", "Tim", 5.23));
        assertFalse(bank.addCustomer("Charlotte", "Tim", 54.23));
    }

}
