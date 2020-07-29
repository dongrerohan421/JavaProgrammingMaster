package com.section5_control_flow_statements.ce14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class SumOddRangeTest {

	private final SumOddRange sumOddRange = new SumOddRange();

	@SuppressWarnings("static-access")
	@Test
	void testIsOdd() {
		boolean expected = true;
		boolean actual = sumOddRange.isOdd(3);

		assertEquals(expected, actual);

		boolean expected_1 = true;
		boolean actual_1 = sumOddRange.isOdd(4);

		assertNotEquals(expected_1, actual_1);
	}

	@SuppressWarnings("static-access")
	@Test
	void testSumOdd() {
		int expected = 2500;
		int actual = sumOddRange.sumOdd(1, 100);

		assertEquals(expected, actual);
	}

	@SuppressWarnings("static-access")
	@Test
	void testIsNumberLessThanZero() {
		int number = -2;
		boolean expected = true;
		boolean actual = sumOddRange.isNumberLessThanZero(number);

		assertEquals(expected, actual);

	}

	@SuppressWarnings("static-access")
	@Test
	void testIsNumberDivisibleByTwo() {
		int number = 4;
		boolean expected = true;
		boolean actual = sumOddRange.isNumberDivisibleByTwo(number);

		assertEquals(expected, actual);
	}

	@Test
	void testIsStartAndEndGreaterThanZero() {
		int start = 4;
		int end = 8;
		boolean expected = true;
		boolean actual = sumOddRange.isStartAndEndGreaterThanZero(start, end);

		assertEquals(expected, actual);
	}

	@Test
	void testIsEndGreaterThanOrEqualToStart() {
		int start = 4;
		int end = 8;
		boolean expected = true;
		boolean actual = sumOddRange.isEndGreaterThanOrEqualToStart(start, end);

		assertEquals(expected, actual);
	}

}
