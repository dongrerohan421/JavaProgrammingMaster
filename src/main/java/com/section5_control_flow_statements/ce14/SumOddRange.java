package com.section5_control_flow_statements.ce14;

public class SumOddRange {

	private static final boolean FALSE = false;
	private static final boolean TRUE = true;

	public static void main(String[] args) {
		sumOdd(1, 100);
		sumOdd(-1, 100);
		sumOdd(100, 100);
		sumOdd(13, 13);
		sumOdd(100, -100);
		sumOdd(100, 1000);
		sumOdd(1, 11);
	}

	public static boolean isOdd(int number) {
		if (isNumberLessThanZero(number))
			return FALSE;
		else
			return !isNumberDivisibleByTwo(number) ? TRUE : FALSE;
	}

	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (isStartAndEndGreaterThanZero(start, end) && isEndGreaterThanOrEqualToStart(start, end)) {
			for (int i = start; i <= end; i++) {
				if (isOdd(i))
					sum += i;
			}
			return sum;
		}
		return -1;
	}

	public static boolean isNumberLessThanZero(int number) {
		return number < 0;
	}

	public static boolean isNumberDivisibleByTwo(int number) {
		return number % 2 == 0;
	}

	public static boolean isStartAndEndGreaterThanZero(int start, int end) {
		return start > 0 && end > 0;
	}

	public static boolean isEndGreaterThanOrEqualToStart(int start, int end) {
		return end >= start;
	}
}
