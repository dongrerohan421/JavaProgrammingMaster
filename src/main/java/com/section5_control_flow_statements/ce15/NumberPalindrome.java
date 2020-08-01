package com.section5_control_flow_statements.ce15;

public class NumberPalindrome {

	public static void main(String[] args) {
		isPalindrome(707);
		isPalindrome(-1221);
		isPalindrome(11212);
	}

	public static boolean isPalindrome(int number) {
		int lastDigit;
		int temp;
		int reverse = 0;

		temp = number;
		while (number != 0 || isNumberGreaterThanZero(number)) {
			lastDigit = number % 10;
			reverse = (reverse * 10) + lastDigit;
			number /= 10;

		}

		if (temp == reverse) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean isNumberGreaterThanZero(int number) {
		return number > 0;
	}

}
