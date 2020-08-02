package com.section5_control_flow_statements.ce16;

public class FirstLastDigitSum {

    public static void main(final String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(final int number) {
        int lastDigit;
        int firstDigit;
        int divisor;
        int sum = 0;
        int totalDigits = 0;

        if (number == 0) {
            return 0;
        }

        // find lastDigit
        lastDigit = number % 10;

        // find total number of digits
        totalDigits = findTotalDigits(number);

        // calculate divisor value
        divisor = (int) Math.pow(10, totalDigits - 1);

        // find first digit
        firstDigit = number / divisor;

        // add values
        sum = firstDigit + lastDigit;

        return (sum > 0) ? sum : -1;
    }

    // method to find total number of digits
    private static int findTotalDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}