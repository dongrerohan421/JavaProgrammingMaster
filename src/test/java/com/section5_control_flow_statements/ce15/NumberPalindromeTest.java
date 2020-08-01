package com.section5_control_flow_statements.ce15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberPalindromeTest {

	public final NumberPalindrome numberPalindrome = new NumberPalindrome();

	@SuppressWarnings("static-access")
	@Test
	void testIsPalindromeTrue() {
		boolean expected = true;
		boolean actual = numberPalindrome.isPalindrome(707);

		Assertions.assertEquals(expected, actual);
	}

	@SuppressWarnings("static-access")
	@Test
	void testIsPalindromeFalse() {
		boolean expected = true;
		boolean actual = numberPalindrome.isPalindrome(11212);

		Assertions.assertNotEquals(expected, actual);
	}
}
